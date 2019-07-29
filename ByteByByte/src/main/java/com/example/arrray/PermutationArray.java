package com.example.arrray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3}; 
		getPermutations(arr).stream().forEach(e->{
			Arrays.stream(e).forEach(i->System.out.print(i+","));
			System.out.println();
		});
	}

	public static List<int[]> getPermutations(int[] arr) {
		List<int[]> result = new ArrayList<int[]>();
		getPermutations(arr, 0, result);
		return result;
	}

	private static void getPermutations(int[] arr, int start, List<int[]> result) {
		if(start>=arr.length) {
			result.add(arr.clone());
			return;
		}
		for (int i = start; i < arr.length; i++) {
			swipe(arr,i,start);
			getPermutations(arr,start+1,result);
			swipe(arr,i,start);
		}
	}

	private static void swipe(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	

}
