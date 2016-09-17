package com.jx.utility.common_utility.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import net.sf.json.JSONObject;

public  class ReadProperties {
	private  String urlFile;
	
	public String getUrlFile() {
		return urlFile;
	}

	public void setUrlFile(String urlFile) {
		if(urlFile==null || "".equals(urlFile)){
			throw new NullPointerException("数据库属性文件找不到");
		}
		this.urlFile = urlFile.replace("classpath:", "/");
	}

	public String getConfigByName(String name){
		Properties properties=new Properties();
		InputStream ins=ReadProperties.class.getResourceAsStream(urlFile);
		try {
			properties.load(ins);
			return properties.getProperty(name);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				ins.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public  JSONObject getAllConfig(){
		Properties properties=new Properties();
		InputStream ins=ReadProperties.class.getResourceAsStream(urlFile);
		Map<String, String> map=new HashMap<String, String>();
		try {
			properties.load(ins);
			Set<Map.Entry<Object, Object>> enSet=properties.entrySet();
			for(Map.Entry<Object, Object> entry:enSet){
				map.put(entry.getKey().toString(), entry.getValue().toString());
			}
			JSONObject jsonObject=JSONObject.fromObject(map);
			return jsonObject;
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				ins.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
