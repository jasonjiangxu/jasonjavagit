package com.centaline.sysmgr.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centaline.sysmgr.mapper.MenuMapper;
import com.centaline.sysmgr.model.TMenu;
import com.centaline.sysmgr.service.MenuService;
import com.jx.utility.web.PageUtil;


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
	
	@Autowired
	private MenuMapper menuMapper;
	
	@Override
	public int saveMenu(TMenu menu) throws Exception{
		int row=menuMapper.insertMenu(menu);
		if(row<=0){
			throw new Exception("录入数据失败!");
		}
		return row;
	}

	@Override
	public PageUtil<TMenu> findMenusByPage(Integer page, Integer rows, String[] condis, TMenu tm) {
		//构造分页对象
		PageUtil<TMenu> pageUser=new PageUtil<TMenu>();
		pageUser.setPage(page); //设置当前页
		pageUser.setLimit(rows); //设置每页大小
		List<TMenu> menus=menuMapper.findMenusByPage(page, rows, condis, tm);
		pageUser.setRows(menus);
		return pageUser;
	}
	
	public MenuMapper getMenuMapper() {
		return menuMapper;
	}
	public void setMenuMapper(MenuMapper menuMapper) {
		this.menuMapper = menuMapper;
	}
	
}
