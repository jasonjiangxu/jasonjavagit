package com.centaline.custormer.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centaline.custormer.mapper.xml.CustMapper;
import com.centaline.custormer.service.ICustService;

@Service("custService") 
public class CustServiceImpl implements ICustService {
	
	@Autowired
	private CustMapper custMapper;
}
