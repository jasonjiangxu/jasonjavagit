package com.jx.utility.common_utility;

import com.jx.utility.common_utility.util.Common;

public class Testm {

	public static void main(String[] args) {
		System.out.println(Common.toUpperCaseFirstOne("fffsfdsfsdfdsf"));
		System.out.println(Common.toLowerCaseFirstOne("FFSFSFSDFDSF"));
		
		System.out.println(Common.isEmptStr("1"));
		
		System.out.println(Common.getPYM("姜旭"));
		
		System.out.println(Common.getMD5("姜旭"));
		
		System.out.println(Common.getCode("100","E",10));
		
		String[] str = {"1","2","3","4","5"};
		
		System.out.println(Common.JoinString(str));
	}
}
