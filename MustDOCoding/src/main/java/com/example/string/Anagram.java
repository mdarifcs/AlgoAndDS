package com.example.string;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "geeksforgeeks";
		String str2 = "forgeeksgeeks";

		if (isAnagramByXOR(str1, str2))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	private static boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;

		char arr[] = new char[1<<8];
		for (int i = 0; i < str1.length(); i++) {
			arr[str1.charAt(i)-'a'] += 1;
			arr[str2.charAt(i)-'a'] -= 1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=0) 
				return false;
		}
		return true;
	}
	
	private static boolean isAnagramByXOR(String str1, String str2) {
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		int tmp = 0;
		for (int i = 0; i < ch1.length; i++) 
			tmp ^= ch1[i];
		for (int i = 0; i < ch2.length; i++) 
			tmp ^= ch2[i];
		return tmp==0?true:false;
	}

}
