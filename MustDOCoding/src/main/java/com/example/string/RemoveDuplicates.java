package com.example.string;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("");
		Pattern delimiter = scan.delimiter();
		
		System.out.println(delimiter);
		//System.out.println(removeDuplicates(str));
	}

	private static String removeDuplicates(String str) {
		int arr[] = new int[256];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (arr[str.charAt(i)] == 0) 
				sb.append(str.charAt(i));
			arr[str.charAt(i)] += 1;
		}
		return sb.toString();
	}

}
