package com.example.string.recursion;

public class ReverseString {
	public static void main(String[] args) {
		String str = "abcd";
		StringBuilder sb = new StringBuilder();
		reverse(str,sb,str.length()-1);
		System.out.println(sb.toString());
	}

	private static void reverse(String str, StringBuilder sb, int length) {
		if(length<0) return;
		sb.append(str.charAt(length));
		reverse(str, sb, length-1);
	}
}
