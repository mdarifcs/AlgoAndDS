package com.example.string;

public class ReverseWords {

	public static void main(String[] args) {
		String str = "i.like.this.program.very.much";
		String revStr = reverseWords(str);
		System.out.println(revStr.substring(0, revStr.length()-1));
	}

	private static String reverseWords(String str) {
		String strArr[] = str.split("\\.");
		StringBuilder sb = new StringBuilder();
		for (int i=strArr.length-1; i>=0; i--) {
			sb.append(strArr[i]+".");
		}
		return sb.toString();
	}

}
