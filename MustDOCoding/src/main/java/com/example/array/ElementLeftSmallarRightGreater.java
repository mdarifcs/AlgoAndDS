package com.example.array;

public class ElementLeftSmallarRightGreater {

	public static void main(String[] args) {
		int arr[] = {7,12,43,22,20,30,24,44};
		findElement(arr);
	}

	private static void findElement(int[] arr) {
		int result = -1;
		int max = arr[0];
		int index = -1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]>=max) {
				max=arr[i];
				if (result == -1 && i<arr.length-1) {
					result = arr[i];
					index = i;
				}
					
			} else if (arr[i]<result){
				result = -1;
			}
		}
		if (result == -1) 
			System.out.println("Element not found");
		else
			System.out.println("element is "+result+" and index "+index);
	}

}
