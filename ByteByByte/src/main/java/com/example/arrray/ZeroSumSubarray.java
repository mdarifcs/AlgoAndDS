package com.example.arrray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mohammad.arif
 * Given an array, write a function to find subarray that sums to zero, if one exists
 */
public class ZeroSumSubarray {

	public static void main(String[] args) {
		int[] arr = {1,2,-5,1,2,1,2};
		int[] subArr = getZeroSumSubarray(arr);
		if (subArr== null)
			System.out.println("sub array not found");
		else
			System.out.println(Arrays.toString(subArr));
	}

	private static int[] getZeroSumSubarray(int[] arr) {
		if (arr[0]==0) {
			return Arrays.copyOfRange(arr, 0, 1);
		}
		
		Map<Integer,Integer> map = new HashMap<>();
		int sum = arr[0];
		map.put(sum, 0);
		for (int i = 1; i < arr.length; i++) {
			sum+=arr[i];
			if(map.containsKey(sum))
				return Arrays.copyOfRange(arr, map.get(sum)+1, i+1);
			else
				map.put(sum, i);
		}
		
		if (map.containsKey(sum)) 
			return arr;
		return null;
	}
}
