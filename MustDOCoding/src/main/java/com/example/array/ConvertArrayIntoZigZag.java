package com.example.array;

public class ConvertArrayIntoZigZag {

	public static void main(String[] args) {
		int arr[] = {4,3,7,8,6,2,1};
		convertToZigZag(arr);
		for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i]+" ");
	}

	private static void convertToZigZag(int[] arr) {
		boolean flipFlag = true;
		for (int i = 0; i < arr.length-1; i++) {
			if (flipFlag) {
				if (arr[i]>arr[i+1]) 
					swipe(arr,i,i+1);
			} else {
				if (arr[i]<arr[i+1])
					swipe(arr, i, i+1);
			}
			flipFlag = !flipFlag;
		}
	}

	private static void swipe(int[] arr, int start, int end) {
		int tmp = arr[start];
		arr[start]=arr[end];
		arr[end]=tmp;
	}

}
