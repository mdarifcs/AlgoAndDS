package com.example.array;

public class ElementAppearsOnce {
	public static void main(String[] args) {
		int arr[] = {1,1,2,2,3,3,4,50,50,65,65};
		
		System.out.println(findElement(arr));
	}

	private static int findElement(int[] arr) {
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			temp = temp^arr[i];
		}
		return temp;
	}
}
