package com.example.string;

public class RotateStringByTwoPlaceAndCheck {

	public static void main(String[] args) {
		String str1 = "amazon";
		String str2	= "azonam";
		int k = 2;
		if (str1.equalsIgnoreCase(leftRotate(str2,k)) || str1.equalsIgnoreCase(rightRotate(str2, k))) 
			System.out.println("1");
		 else 
			System.out.println("0");
	}

	private static String leftRotate(String str2, int k) {
		char[] charArray = str2.toCharArray();
		reverseArray(charArray,0,str2.length()-1-k);
		reverseArray(charArray, str2.length()-k, str2.length()-1);
		reverseArray(charArray, 0, str2.length()-1);
		return new String(charArray);
	}
	
	private static String rightRotate(String str2, int k) {
		char[] charArray = str2.toCharArray();
		reverseArray(charArray,0,k-1);
		reverseArray(charArray, k, str2.length()-1);
		reverseArray(charArray, 0, str2.length()-1);
		return new String(charArray);
	}
	
	private static char[] reverseArray(char arr[], int start, int end){
		while (start<=end) {
			char tmp = arr[start];
			arr[start] = arr[end];
			arr[end] = tmp;
			start++;
			end--;
		}
		return arr;
	}

}
