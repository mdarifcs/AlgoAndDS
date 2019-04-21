package com.example.string;

public class LongestCommonSubstring {
	
	private static int max = 0;
	private static int x = 0;
	private static int y = 0;
	private static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		String str1 = "ABCDGH";
		String str2 = "ACDGHR";
		System.out.println(getLongestSubstring(str1, str2));
	}

	private static String getLongestSubstring(String str1, String str2) {
		int mat[][] = new int[str1.length()][str2.length()];
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i)==str2.charAt(j)) 
					update(mat,i,j,str1.charAt(i));
			}
		}
		System.out.println(max);
		System.out.println();
		return getString(mat,str1);
	}
	
	

	private static String getString(int[][] mat, String str1) {
		while (true) {
			if (x>=0 && y>=0 && mat[x][y]>0) {
				sb.append(str1.charAt(x));
				x--;
				y--;
				continue;
			}
			break;
		}
		return sb.reverse().toString();
	}

	private static void update(int[][] mat, int i, int j, char c) {
		if (isDiagonalPresent(i, j) && mat[i-1][j-1]>0)
			mat[i][j] = mat[i-1][j-1]+1;
		else 
			mat[i][j] = 1;
		
		if (mat[i][j]>max) {
			max = mat[i][j];
			x=i;
			y=j;
		}
	}

	private static boolean isDiagonalPresent(int i, int j){
		return (i==0 || j==0)?false:true;
	}

}
