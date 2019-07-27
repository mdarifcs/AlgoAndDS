package com.example.string;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "abchhdeeef";
		String str2 = "cdabehhfee";
		System.out.println(checkAnagram(str1,str2));
	}

	private static boolean checkAnagram(String str1, String str2) {
		if (str1.length()!=str2.length()) return false;
		int arr[] = new int[26];
		
		for (char c : str1.toCharArray()) 
			arr[c-'a']++;
		
		for (char c : str2.toCharArray()) 
			arr[c-'a']--;
		
		for (int i = 0; i < 26; i++) 
			if(arr[i]!=0) return false;
		
		return true;
	}
}
