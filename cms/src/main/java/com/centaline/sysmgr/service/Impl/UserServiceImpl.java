package com.centaline.sysmgr.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.centaline.core.dao.IBaseDao;
import com.centaline.core.service.BaseService;
import com.centaline.core.web.HqlWhereUtil;
import com.centaline.core.web.PageUtil;
import com.centaline.sysmgr.model.TUser;
import com.centaline.sysmgr.service.UserService;

/**
 * 
 * @ClassName: UserServiceImpl 
 * @Description: TODO(用户业务操作层实现类,这里增加对事物的处理) 
 * @author 姜旭(JasonJiang)
 * @date 2015年6月26日 上午10:33:20 
 *
 */
@Service("userService")
public class UserServiceImpl extends BaseService<TUser> implements UserService {

	@Resource(name = "baseDao") 
	private IBaseDao<TUser> baseDao;
	
	@Override
	public PageUtil<TUser> findUser(Integer page, Integer rows, TUser tuser,String condition) {
		tuser.setDelFlg('N');//标记为未删除
		HqlWhereUtil whereutil = null;
		try {
			whereutil = createHqlByEntity(tuser);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//构造分页对象
		PageUtil<TUser> pageUser=new PageUtil<TUser>();
		pageUser.setPage(page); //设置当前页
		pageUser.setLimit(rows); //设置每页大小
		PageUtil<TUser> userList= baseDao.selectPageListByHql(whereutil.getHql(), pageUser,whereutil.getObjParames());
		return userList;
	}

	@Override
	public void saveTUser(TUser user) throws Exception {
		baseDao.insertObject(user);
	}

	@Override
	public void InitialWorkNumber() {
		
	}
	
	/*private HqlWhereUtil whereCondition(TUser tuser,String condition){
		HqlWhereUtil wherutil=new HqlWhereUtil();
		StringBuffer sb=new StringBuffer(" FROM TUser as t");
		int index=0;
		List<Object> arrlist=new ArrayList<Object>();
		if(tuser!=null){
			//状态作为条件
			if(StringUtils.isNotEmpty(String.valueOf(tuser.getDelFlg()))){
				sb.append(linkChar(index)).append(" t.delFlg=? ");
				arrlist.add(tuser.getDelFlg());
				index++;
			}
			
			//登录名作为条件
			if(StringUtils.isNotEmpty(tuser.getLoginName())){
				sb.append(linkChar(index)).append(" t.loginName=? ");
				arrlist.add(tuser.getLoginName());
				index++;
			}
			//昵称作为条件
			if(StringUtils.isNotEmpty(tuser.getNicName())){
				sb.append(linkChar(index)).append(" t.nicName like ? ");
				arrlist.add("%"+tuser.getNicName()+"%");
				index++;
			}
			//用户名作为条件
			if(StringUtils.isNotEmpty(tuser.getUserName())){
				sb.append(linkChar(index)).append(" t.userName like ? ");
				arrlist.add("%"+tuser.getUserName()+"%");
				index++;
			}
			//性别作为条件
			if(StringUtils.isNotEmpty(String.valueOf(tuser.getSex()).trim())){
				sb.append(linkChar(index)).append(" t.sex=? ");
				arrlist.add(tuser.getSex());
				index++;
			}
			//工号作为条件
			if(StringUtils.isNotEmpty(tuser.getCode())){
				sb.append(linkChar(index)).append(" t.code=? ");
				arrlist.add(tuser.getCode());
				index++;
			}
			//状态作为条件
			if(StringUtils.isNotEmpty(String.valueOf(tuser.getStatus()).trim())){
				sb.append(linkChar(index)).append(" t.status=? ");
				arrlist.add(tuser.getStatus());
				index++;
			}
			//拼音码作为条件
			if(StringUtils.isNotEmpty(tuser.getSpell())){
				sb.append(linkChar(index)).append(" t.spell like ? ");
				arrlist.add("%"+tuser.getSpell()+"%");
				index++;
			}
			//时间作为条件
			if(StringUtils.isNotEmpty(tuser.getBeginDate()) && StringUtils.isNotEmpty(tuser.getEndDate())){
				sb.append(linkChar(index)).append(" t.createTime between ? and ? ");
				arrlist.add(tuser.getBeginDate());
				arrlist.add(tuser.getEndDate());
				index++;
			}
			
			//多条件查询
			if(StringUtils.isNotEmpty(condition)){
				String[] cdis=condition.split(",");
				for(String sdi:cdis){
					sb.append(linkChar(index)).append(" (t.loginName like ? or t.nicName like ? or t.userName like ? or t.code like ? or t.spell like ? )");
					for(int i=0;i<5;i++){
						arrlist.add("%"+sdi+"%");
					}
					index++;
				}
			}
		}
		String hql=sb.toString();
		Object[] conditio=Common.listToArray(arrlist);
		
		wherutil.setHql(hql);
		wherutil.setObjParames(conditio);
		return wherutil;
	}*/
	
}
