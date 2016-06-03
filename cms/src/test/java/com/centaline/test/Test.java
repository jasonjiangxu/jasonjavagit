package com.centaline.test;

import java.util.Date;

import com.centaline.sysmgr.model.TUser;




public class Test<T> {

	public static void main(String[] args) {
		/*TUser tm=new TUser();
		tm.setCode("0000");
		tm.setLoginName("百度管理");
		tm.setNicName("0");
		tm.setUserName("http://www.baidu.com");
		tm.setSex('0');
		tm.setRemark("备注斯蒂芬斯蒂芬第三方");
		tm.setCreateUser("admin");
		tm.setCreateTime(new Date());
		tm.setBirthDay("");
		tm.setDelFlg('N');*/
		TUser tm=new TUser();
		tm.setLoginName("干啥呢");
		tm.setCode("00001");
		tm.setBirthDay(new Date());
		tm.setBeginBirthDay("2015-12");
		tm.setEndBirthDay("2016-01");
		tm.setSex('1');
		//Test<TUser> t=new Test<TUser>();
		//String sql;
		try {
			/*HqlWhereUtil dl = t.createHqlByEntity(tm);
			System.out.println(dl.getHql());
			System.out.println(dl.getObjParames().length);*/
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*Method[] methods= c.getDeclaredMethods();
		for(Method method:methods){
			System.out.println(method.getModifiers());
		}*/
	}
}
