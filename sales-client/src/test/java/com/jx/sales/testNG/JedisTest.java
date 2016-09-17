package com.jx.sales.testNG;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.jx.core.redis.RedisUtil;
import com.jx.utility.common_utility.testNG.BaseTestNG;

public class JedisTest extends BaseTestNG{
	
  @Test
  public void testSaveJids() {
	  RedisUtil u=new RedisUtil();
	  u.hset("1004", "1004001", "业主");
	  u.hset("1004", "1004002", "飞流");
	  u.hset("1004", "1004003", "飞dfds");
  }
  
  @Test
  public void testgetJids() {
	  RedisUtil u=new RedisUtil();
	  String user= u.hget("1004", "1004001");
	  System.out.println("hget:"+user);
	  
	  Map<String,String> uall= u.hgetall("1004");
	  System.out.println("hgetall:"+uall);
	  
	  List<String> uaf= u.hmget("1004", new String[]{"1004001","1004002"});
	  System.out.println("hgetall:"+uaf);
  }
}
