package com.example.array;

public class RelativeSorting {

	public static void main(String[] args) {
		int arr1[] = {45,15,23,8,5,12,26,444,888,151,12,23,45,15,56};
		int arr2[] = {15,888,444,5,8,12,23};
		doRelativeSort(arr1,arr2);
	}

	private static void doRelativeSort(int[] arr1, int[] arr2) {
		int maxElementInArr = findMax(arr1);
		int countArr[] = new int[maxElementInArr+1];
		for (int i = 0; i < arr1.length; i++) 
			countArr[arr1[i]] += 1; 
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < countArr[arr2[i]]; j++) {
				sb.append(arr2[i]+" ");
			}
			countArr[arr2[i]] = 0;
		}
		
		for (int i = 0; i < countArr.length; i++) {
			for (int j = 0; j < countArr[i]; j++) 
				sb.append(i+" ");
		}
		System.out.println(sb.toString());
	}

	private static int findMax(int[] arr1) {
		int max = arr1[0];
		for (int i = 1; i < arr1.length; i++) {
			if (arr1[i]>max) 
				max = arr1[i];
		}
		return max;
	}

}
