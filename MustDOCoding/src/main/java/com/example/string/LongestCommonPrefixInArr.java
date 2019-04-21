package com.example.string;

import java.util.Scanner;

public class LongestCommonPrefixInArr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String strArr[] = new String[n];
		for (int i = 0; i < n; i++) strArr[i] = scan.next();
		String retVal = getLongestPrefix(strArr);
		if("".equalsIgnoreCase(retVal)) System.out.println("-1");
		else  System.out.println(retVal);
	}

	private static String getLongestPrefix(String[] strArr) {
		int minLengthString = Integer.MAX_VALUE;
		for (int i = 0; i < strArr.length; i++)	if (minLengthString > strArr[i].length()) minLengthString = strArr[i].length();
		int j = 0;
		out:
		for (; j < minLengthString; j++) for (int i = 0; i < strArr.length; i++) if(strArr[0].charAt(j)!=strArr[i].charAt(j)) break out;
		return strArr[0].substring(0,j);
	}

}
