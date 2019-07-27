package com.example.string;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		String str = "abcdef";
		StringBuffer sb = new StringBuffer();
		ReverseString(str,sb,str.length()-1);
		System.out.println(sb.toString());
	}

	private static void ReverseString(String str, StringBuffer sb, int length) {
		if(length<0) return;
		sb.append(str.charAt(length));
		ReverseString(str, sb, length-1);
	}
}
