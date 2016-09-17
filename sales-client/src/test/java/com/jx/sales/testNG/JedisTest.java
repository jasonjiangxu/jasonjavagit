package com.jx.sales.testNG;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.testng.annotations.Test;

import com.jx.utility.common_utility.testNG.BaseTestNG;

public class JedisTest extends BaseTestNG{
	
  @Test
  public void testSaveJids() {
	  StringRedisTemplate  custserv=(StringRedisTemplate ) getCtx().getBean("redisTemplatestring");
	  ValueOperations<String, String> valueops=custserv.opsForValue();
	  valueops.set("username", "jiangxu");
  }
}
