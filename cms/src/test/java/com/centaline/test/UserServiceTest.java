package com.centaline.test;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.centaline.core.web.GridJsonUtil;
import com.centaline.core.web.PageUtil;
import com.centaline.sysmgr.model.TUser;
import com.centaline.sysmgr.service.UserService;

/**
 * 菜单service层测试例子
 * @author jiangxu2
 *
 */
public class UserServiceTest extends  JUnitBaseService{
	@Autowired  
	private UserService userService; 
	
	/**
	 * 测试插入
	 */
	@Test
	public void testSaveService() {
		for(int i=0;i<10;i++){
			TUser tm=new TUser();
			tm.setCode("0000"+i);
			tm.setLoginName("百度管理"+i);
			tm.setNicName("0"+i);
			tm.setUserName("http://www.baidu.com"+i);
			tm.setSex('0');
			tm.setRemark("备注斯蒂芬斯蒂芬第三方"+i);
			tm.setCreateUser("admin"+i);
			tm.setCreateTime(new Date());
			//tm.setBirthDay("");
			tm.setDelFlg('N');
			
			try {
				long start1=System.currentTimeMillis();
				userService.saveTUser(tm);
				long start2=System.currentTimeMillis();
				System.out.println("自动保存一条数据时间："+(start2-start1)+"毫秒");
				
			} catch (Exception e) {
				System.out.println("插入失败");
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void testFindByPageService() {
		TUser tt=new TUser();
		PageUtil<TUser> pu=userService.findUser(1, 5, tt,"0");

		System.out.println(pu.getTotal());
		for(TUser t:pu.getRows()){
			System.out.println(t.getLoginName()+"*****"+t.getNicName());
		}
	}
	
}
