package com.centaline.sysmgr.service.Impl;

import org.springframework.stereotype.Service;

import com.centaline.sysmgr.model.TMenu;
import com.centaline.sysmgr.service.MenuService;


/**
 * 
 * @ClassName: MenuServiceImpl 
 * @Description: TODO(菜单业务操作层实现类,这里增加对事物的处理) 
 * @author 姜旭(JasonJiang)
 * @date 2015年6月26日 上午10:16:45 
 *
 */
@Service("menuService") 
public class MenuServiceImpl   implements MenuService {
	
	/*@Resource(name = "baseDao") 
	private IBaseDao<TMenu> baseDao;*/
	
	public void saveMenu(TMenu menu) throws Exception{
	//	baseDao.insertObject(menu);
	}
	
}
