package com.example.array;

import java.util.Arrays;

public class LargestNumberFormed {

	public static void main(String[] args) {
		String arr[] = {"3","30","34","5","9"};
		sortArrayToFormLargestNo(arr);
	}

	private static void sortArrayToFormLargestNo(String[] arr) {
		Arrays.sort(arr, (o1,o2)-> -(o1+o2).compareTo(o2+o1));
		StringBuffer sb = new StringBuffer();
		for (String str : arr)
			sb.append(str);
		System.out.println(sb.toString());
	}

}
