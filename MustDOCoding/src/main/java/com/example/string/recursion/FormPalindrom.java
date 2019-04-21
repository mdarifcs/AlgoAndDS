package com.example.string.recursion;

public class FormPalindrom {

	public static void main(String[] args) {
		String str = "abc";
		System.out.println(getMinCharReqToFormPalindrom(str, 0, str.length()-1));
	}

	private static int getMinCharReqToFormPalindrom(String str, int low, int high) {
		if (low>high) return Integer.MAX_VALUE;
		if (low==high) return 0;
		if (low==high-1) return str.charAt(low)==str.charAt(high)?0:1;
		
		return str.charAt(low)==str.charAt(high)?getMinCharReqToFormPalindrom(str, low+1, high-1):
			(Integer.min(getMinCharReqToFormPalindrom(str, low, high-1), getMinCharReqToFormPalindrom(str, low+1, high))+1);
	}

}
