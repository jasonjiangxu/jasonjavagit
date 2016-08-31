package com.centaline.test;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.centaline.core.web.PageUtil;
import com.centaline.sysmgr.model.TMenu;
import com.centaline.sysmgr.service.MenuService;

import net.sf.json.JSONArray;

/**
 * 菜单service层测试例子
 * @author jiangxu2
 *
 */
public class MenuServiceTest extends  JUnitBaseService{
	
	@Autowired
	private MenuService menuService;
	
	/**
	 * 测试插入
	 */
	@Test
	public void testSaveService() {
		TMenu tm=new TMenu();
		tm.setId(UUID.randomUUID().toString());
		tm.setCode("00002");
		tm.setName("姜旭");
		tm.setParentCode("0");
		tm.setUrl("http://www.baidu.com");
		tm.setIcon("icom");
		tm.setRemark("1111");
		tm.setCreateUser("admin");
		tm.setCreateTime(new Date());
		tm.setLevel(1);
		tm.setDelFlg('N');
		tm.setVersion(0);
		
		try {
			long start1=System.currentTimeMillis();
			menuService.saveMenu(tm);
			long start2=System.currentTimeMillis();
			System.out.println("自动保存一条数据时间："+(start2-start1)+"毫秒,保存数据主键："+tm.getId());
			
		} catch (Exception e) {
			System.out.println("插入失败");
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testFindService() {
		PageUtil<TMenu> mu=menuService.findMenusByPage(0, 10, null, null);
		List<TMenu> ms=mu.getRows();
		JSONArray jar=JSONArray.fromObject(ms);
		System.out.println(jar.toString());
	}

}
