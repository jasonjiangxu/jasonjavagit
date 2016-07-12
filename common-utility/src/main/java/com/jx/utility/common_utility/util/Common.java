package com.jx.utility.common_utility.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;


/**
 * 
 * @ClassName: Common 
 * @Description: TODO(通用工具类) 
 * @author 姜旭(JasonJiang)
 * @date 2015年7月27日 上午8:56:55 
 *
 */
public class Common {
	
	/**
	 * 
	 * @Title: isEmptStr 
	 * @Description: TODO(判断字符串为空或null) 
	 * @param @param str
	 * @param @return    设定文件 
	 * @return boolean    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年7月27日 上午8:57:12
	 *
	 */
	public static boolean isEmptStr(String str){
		return str==null || Constant.EMPTY.equals(str);
	}
	
	/**
	 * 
	 * @Title: isNullObj 
	 * @Description: TODO(判断对象为NULL) 
	 * @param @param obj
	 * @param @return    设定文件 
	 * @return boolean    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年7月27日 上午8:57:23
	 *
	 */
	public static boolean isNullObj(Object obj){
		return obj==null;
	}
	
	/**
	 * 
	 * @Title: getPYM 
	 * @Description: TODO(得到拼音码) 
	 * @param @param str
	 * @param @return    设定文件 
	 * @return String    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年7月27日 上午8:57:32
	 *
	 */
	public static String getPYM(String str) {
		String result = "";       
		char[] strChars=str.toCharArray(); //得到汉字数组 
		// 汉字区位码
		HanyuPinyinOutputFormat pyFormat = new HanyuPinyinOutputFormat();
		pyFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
		pyFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
		pyFormat.setVCharType(HanyuPinyinVCharType.WITH_V);
		for (int i = 0; i < strChars.length; i++) {     
			if (strChars[i] > 128) {
				try {
					result += PinyinHelper.toHanyuPinyinStringArray(strChars[i], pyFormat)[0].charAt(0);
				} catch (BadHanyuPinyinOutputFormatCombination e) {
					e.printStackTrace();
				}
			}else{
				result += strChars[i];       
			}
		}
		return result;
	}
	
	/**
	 * 
	 * @Title: getMD5 
	 * @Description: TODO(得到MD5加密) 
	 * @param @param str
	 * @param @return    设定文件 
	 * @return String    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年7月27日 上午8:57:40
	 *
	 */
	public static String getMD5(String str){
		MessageDigest messageDigest = null;
		try {
			messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.reset();  
			messageDigest.update(str.getBytes("UTF-8"));  
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}  catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		byte[] byteArray = messageDigest.digest();  
		StringBuffer md5StrBuff = new StringBuffer();  
		for (int i = 0; i < byteArray.length; i++) {   
			if (Integer.toHexString(0xFF & byteArray[i]).length() == 1)
				 md5StrBuff.append("0").append(Integer.toHexString(0xFF & byteArray[i]));  
			else
				md5StrBuff.append(Integer.toHexString(0xFF & byteArray[i]));  
		}
		return md5StrBuff.toString();  
	}
	
	/**
	 * 
	 * @Title: getCode 
	 * @Description: TODO(生成编码) 
	 * @param @param code
	 * @param @param firstLetter
	 * @param @param digit
	 * @param @return    设定文件 
	 * @return String    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年7月27日 上午8:58:16
	 *
	 */
	public static String getCode(String code,String firstLetter,int digit){
		if("".equals(code) || code==null){
			code=firstLetter;
			for(int i=0;i<digit;i++){
				code+="0";
			}
		}else{
			code=code.replaceFirst(firstLetter, "");
			int maxnum=Integer.parseInt(code);
			maxnum++;
			String maxnumStr=String.valueOf(maxnum);
			while(maxnumStr.length()<digit){
				maxnumStr="0"+maxnumStr;
			}
			code=firstLetter+maxnumStr;
		}
		return code;
	}
	
	/**
	 * 
	 * @Title: JoinString 
	 * @Description: TODO(String[]转换为string) 
	 * @param @param s
	 * @param @return    设定文件 
	 * @return String    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年7月27日 上午9:06:14
	 *
	 */
	public static String JoinString(String[] s){
		String result="";
		for(int i=0,len=s.length;i<len;i++){
			if(i==len-1){
				result+=s[i];
			}else{
				result+=s[i]+",";
			}
		}
		return result;
	}
	
	/**
	 * 
	 * @Title: notEmptyList 
	 * @Description: TODO(返回数组不为空) 
	 * @param @param list
	 * @param @return    设定文件 
	 * @return boolean    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年8月15日 下午4:54:04
	 *
	 */
	public static boolean notEmptyList(List<?> list){
		return (list!=null && list.size()>0);
	}
	
	/**
	 * 
	 * @param list
	 * @return
	 */
	public static Object[] listToArray(List<Object> list){
		return (list!=null && list.size()>0)?list.toArray(new Object[list.size()]):new Object[0];
	}
	
	/**
	 * 首字母变小写
	 * @param s
	 * @return
	 */
	public static String toLowerCaseFirstOne(String s){
		if(Character.isLowerCase(s.charAt(0)))
            return s;
        else
            return (new StringBuilder()).append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
	}
	
	/**
	 * 首字母大写
	 * @param s
	 * @return
	 */
	public static String toUpperCaseFirstOne(String s){
		if(Character.isUpperCase(s.charAt(0)))
            return s;
        else
            return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
	}
}
