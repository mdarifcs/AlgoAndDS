package com.example.arrray;

import java.util.Arrays;

/**
 * @author mohammad.arif
 * Given 2 sorted arrays, A and B, where A is long enough to hold the content of A and B,
 * write a function to copy the contents of B into A without using any buffer or additional memory.
 */
public class MergeTwoSortedArraysIntoOne {

	public static void main(String[] args) {
		int[] arr1 = {1,10,17,0,0,0};
		int[] arr2 = {14,16,20};
		mergerArrays(arr1,arr2,3,3);
		System.out.println(Arrays.toString(arr1));
	}

	private static void mergerArrays(int[] arr1, int[] arr2, int arr1Length, int arr2Length) {
		int arr1Index = arr1Length-1;
		int arr2Index = arr2Length-1;
		int mainArrayIndex = arr1.length-1;
		while(arr2Index>=0) {
			if(arr1[arr1Index]<arr2[arr2Index]) {
				swipe(arr1,arr2, mainArrayIndex, arr2Index);
				arr2Index--;
			} else {
				swipe(arr1,arr1,arr1Index,mainArrayIndex);
				arr1Index--;
			}
			mainArrayIndex--;
		}
	}
	
	private static void swipe(int[] arr1, int[] arr2, int arr1Index, int arr2Index) {
		int tmp = arr1[arr1Index];
		arr1[arr1Index] = arr2[arr2Index];
		arr2[arr2Index] = tmp;
	}
}
