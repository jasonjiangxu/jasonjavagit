package com.centaline.core.service;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;

import org.apache.commons.lang.StringUtils;

import com.alibaba.druid.sql.visitor.functions.Char;
import com.centaline.core.defaultannotation.RelationColumn;
import com.centaline.core.util.Common;
import com.centaline.core.web.HqlWhereUtil;

public abstract class BaseService<T> {

	private  String linkChar(int index){
		return index==0?" where ":" and ";
	}
	
	public HqlWhereUtil createHqlByEntity(T tm) throws Exception{
		StringBuffer sb=new StringBuffer();
		HqlWhereUtil wherutil=new HqlWhereUtil();
		if(tm!=null){
			Class<?> c=tm.getClass();
			Field[] fields= c.getDeclaredFields();
			
			sb.append(" FROM ").append(c.getSimpleName()).append(" as t ");
			int index=0;
			List<Object> arrlist=new ArrayList<Object>();
			for(Field field:fields){
				if(!"serialVersionUID".equals(field.getName())){
					Column column=field.getAnnotation(Column.class);
					if(column!=null){
						String fieldName=Common.toUpperCaseFirstOne(field.getName());//首字母大写
						//String setMethod="set"+fieldName;//set方法名
						String getMethod="get"+fieldName;//get方法名
						String isMethod="is"+fieldName;//如果是boolean类型的 则这里的是is方法
						Type fieldType=field.getGenericType(); //属性的返回类型
						if("boolean".equals(fieldType.getTypeName())){
							getMethod=isMethod;
						}
						Object objval=getVal(tm,getMethod);
						
						if(objval instanceof String || objval instanceof Char){
							if(StringUtils.isNotEmpty(objval.toString())){
								sb.append(linkChar(index)).append(" t.").append(field.getName()).append("=? ");
								arrlist.add(objval);
								index++;
							}
						}
						if(objval instanceof Date){
							RelationColumn relationColumn=field.getAnnotation(RelationColumn.class);
							if(relationColumn!=null){
								Object beginval=getVal(tm,relationColumn.beginColumn());
								Object endval=getVal(tm,relationColumn.endColumn());
								if(beginval!=null && endval!=null){
									sb.append(linkChar(index)).append(" t.").append(field.getName()).append(" between ? and ? ");
									arrlist.add(beginval);
									arrlist.add(endval);
									index++;
								}else{
									sb.append(linkChar(index)).append(" t.").append(field.getName()).append("=? ");
									arrlist.add(objval);
									index++;
								}
							}
						}
					}
				}
			}
			
			String hql=sb.toString();
			Object[] conditio=Common.listToArray(arrlist);
			
			wherutil.setHql(hql);
			wherutil.setObjParames(conditio);
		}
		return wherutil;
	}
	
	private Object getVal(T t,String getMethod) throws Exception{
		Class<?> c=t.getClass();
		Method method=c.getDeclaredMethod(getMethod, null); 
		Object objval=method.invoke(t, null);//值
		return objval;
	}
}
