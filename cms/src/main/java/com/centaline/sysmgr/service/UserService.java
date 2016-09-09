package com.centaline.sysmgr.service;

import com.centaline.sysmgr.model.TUser;
import com.jx.utility.web.PageUtil;

/**
 * 
 * @ClassName: UserService 
 * @Description: TODO(用户业务操作层) 
 * @author 姜旭(JasonJiang)
 * @date 2015年6月26日 上午10:20:47 
 *
 */
public interface UserService {
	
	/**
	 * 
	 * @param page  当前页
	 * @param rows  每页大小
	 * @param condis  条件 或者条件
	 * @param tuser 对象条件 并且条件
	 * @return
	 */
	PageUtil<TUser> findUser(Integer page,Integer rows, TUser tuser,String condition);
	
	/**
	 * 保存用户
	 * @param menu
	 * @throws Exception
	 */
	public void saveTUser(TUser user) throws Exception;
	
	/**
	 * 初始化工号 首次注册产生工号
	 */
	public void InitialWorkNumber();
}
