package com.example.arrray;

import java.util.Arrays;

public class MedianOfArrays {

	public static void main(String[] args) {
		int arr1[] = { 1, 3, 6, 7, 9, 20, 30, 40 };
		int arr2[] = { 2, 4, 5, 8 };
		System.out.println("\n\nmedian " + getMedian(arr1, arr2));
	}

	private static double getMedian(int[] arr1, int[] arr2) {
		int[] mergArray = MergeTwoSortedArrays.mergArray(arr1, arr2);
		Arrays.stream(mergArray).forEach(e -> System.out.print(e + " "));
		int length = mergArray.length;
		if (length % 2 == 0)
			return (mergArray[(length / 2) - 1] + mergArray[(length / 2)]) / 2.;
		return mergArray[(length / 2)] / 2.;
	}

	

}
