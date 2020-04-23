package com.wkp.common.utils;



import org.junit.Test;

import com.wkp.common.utils.StringUtil;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		String str="";
		
		System.out.println(StringUtil.hasLength(str));
	}

	@Test
	public void testHasText() {
		String str="q";
		System.out.println(StringUtil.hasText(str));
	}


	@Test
	public void testRandomChineseString() {
		String string = StringUtil.randomChineseString(100);
		System.out.println(string);
	}
	
	
	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 100; i++) {
			String name = StringUtil.generateChineseName();
			System.out.println(name);
		}
	}

}
