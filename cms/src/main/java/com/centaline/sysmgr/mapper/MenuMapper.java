package com.centaline.sysmgr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.centaline.sysmgr.model.TMenu;

@Repository
public interface MenuMapper {
	
	public int insertMenu(TMenu menu);
	
	public List<TMenu> findMenusByPage(@Param(value="page") Integer page, @Param(value="rows") Integer rows, @Param(value="condis") String[] condis,@Param(value="tm") TMenu tm);
}
