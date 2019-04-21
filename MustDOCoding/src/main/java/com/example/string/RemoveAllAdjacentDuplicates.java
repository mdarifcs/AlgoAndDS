package com.example.string;

public class RemoveAllAdjacentDuplicates {

	public static void main(String[] args) {
		String str = "caaabbbaacddldd";
		System.out.println(startProcess(str));
	}

	private static String startProcess(String str) {
		boolean flag = checkAdjacentDuplicatesPresent(str);
		while (flag) {
			str = removeAdjacentDuplicates(str);
			flag = checkAdjacentDuplicatesPresent(str);
		}
		return str;
	}

	private static boolean checkAdjacentDuplicatesPresent(String str) {
		for (int i = 0; i < str.length()-1; i++) {
			if (str.charAt(i)==str.charAt(i+1)) return true;
		}
		return false;
	}
	
	private static String removeAdjacentDuplicates(String str) {
		StringBuffer sb = new StringBuffer();
		if(str.length()<=1)
		    return str;
		int i = 1;
		if (str.charAt(0)!=str.charAt(1)) 
			sb.append((char)str.charAt(0));
		
		while (i < str.length() - 1) {
			if (str.charAt(i - 1) != str.charAt(i) && str.charAt(i) != str.charAt(i + 1))
				sb.append((char)str.charAt(i));
			i++;
		}
		
		if (str.charAt(str.length() - 2)!=str.charAt(str.length() - 1)) 
			sb.append((char)str.charAt(str.length() - 1));
		return sb.toString();
	}

}
