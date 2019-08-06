package com.example.string;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		String str1 = "ABAB";
		String str2 = "BABA";
		
		System.out.println(getLongestCommonSubstring(str1,str2));

	}

	private static String getLongestCommonSubstring(String str1, String str2) {
		if (str1==null || str1.length()==0 ||
				str2==null || str2.length()==0) 
		return "";	
		
		int[][] cache = new int[str1.length()][str2.length()];
		int index = 0;
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if(str1.charAt(i)==str2.charAt(j)) {
					if ((i==0 || j==0)) 
						cache[i][j] = 1;
					else 
						cache[i][j] = cache[i-1][j-1]+1;
					
					if(cache[i][j]>count) {
						index = i;
						count++;
					}
				}
			}
		}
		return str1.substring(index-count+1,index+1);
	}

}
