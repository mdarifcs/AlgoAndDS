package com.example.arrray;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mohammad.arif
 * Given an array of Integers where each value 1<=x<=len(array)
 * write a function that finds all the duplicates in the array
 */
public class DuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,5,4,5,9,1,4,9};
		System.out.println(findDuplicates(arr));
	}

	private static Set<Integer> findDuplicates(int[] arr) {
		Set<Integer> result = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int elementIndex = Math.abs(arr[i])-1;
			if(arr[elementIndex]<0)
				result.add(Math.abs(arr[elementIndex]));
			else 
				arr[elementIndex] = -arr[elementIndex];
		}
		return result;
	}

}
