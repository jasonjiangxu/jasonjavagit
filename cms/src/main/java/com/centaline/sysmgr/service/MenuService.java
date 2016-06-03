package com.centaline.sysmgr.service;

import com.centaline.sysmgr.model.TMenu;

/**
 * 
 * @ClassName: MenuService 
 * @Description: TODO(菜单业务操作层) 
 * @author 姜旭(JasonJiang)
 * @date 2015年6月26日 上午10:14:13 
 *
 */
public interface MenuService{
	
	/**
	 * 保存按钮
	 * @return
	 */
	public void saveMenu(TMenu menu) throws Exception;

}
