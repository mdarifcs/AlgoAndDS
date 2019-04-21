package com.example.array;

import java.util.HashMap;

class LargestSubArray {

	int maxLen(int arr[], int n) {
		HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

		int sum = 0; // Initialize sum of elements
		int max_len = 0; // Initialize result
		int ending_index = -1;

		for (int i = 0; i < n; i++) {
			sum += (arr[i] == 0) ? -1 : 1;
			if (sum == 0) {
				max_len = i + 1;
				ending_index = i;
			}
			if (hM.containsKey(sum)) {
				if (max_len < i - hM.get(sum)) {
					max_len = i - hM.get(sum);
					ending_index = i;
				}
			} else // Else put this sum in hash table
				hM.put(sum, i);
		}
		int end = ending_index - max_len + 1;
		System.out.println(end + " to " + ending_index);
		return max_len;
	}

	public static void main(String[] args) {
		LargestSubArray sub = new LargestSubArray();
		int arr[] = { 1, 0, 0, 1, 0, 1, 1 };
		int n = arr.length;
		sub.maxLen(arr, n);
	}
}
