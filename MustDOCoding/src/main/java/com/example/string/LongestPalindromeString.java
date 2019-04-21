package com.example.string;

public class LongestPalindromeString {

	public static void main(String[] args) {
		String str = "aaaabbaa";
		System.out.println(findLongestPalindromLength(str));
	}

	private static String findLongestPalindromLength(String str) {
		String res = null;
		tag:
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <= i; j++) {
				res = str.substring(j, str.length()-i+j);
				if(subStr(res))
					break tag;
			}
		}
		return res;
	}

	private static boolean subStr(String subStr) {
		return subStr.equals(new StringBuilder(subStr).reverse().toString());
	}

}
