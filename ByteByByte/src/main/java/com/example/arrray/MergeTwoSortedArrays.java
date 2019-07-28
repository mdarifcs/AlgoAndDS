package com.example.arrray;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int arr1[] = { 1, 3, 6, 7, 9, 20, 30, 40 };
		int arr2[] = { 2, 4, 5, 8 };
		int[] mergArray = mergArray(arr1, arr2);
		Arrays.stream(mergArray).forEach(e->System.out.print(e+" "));
	}
	
	public static int[] mergArray(int[] arr1, int[] arr2) {
		int[] mergArr = new int[arr1.length + arr2.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j])
				mergArr[k++] = arr1[i++];
			else
				mergArr[k++] = arr2[j++];
		}

		while (i < arr1.length) {
			mergArr[k++] = arr1[i++];
		}

		while (j < arr2.length) {
			mergArr[k++] = arr2[j++];
		}

		return mergArr;
	}

}
