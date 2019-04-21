package com.example.test;

import org.apache.commons.lang3.StringUtils;

public class MainTest {
	public static void main(String[] args) {
		String str1 = "";
		String str2 = null;
		System.out.println(StringUtils.isBlank(str1));
		System.out.println(StringUtils.isBlank(str2));
	}
}
