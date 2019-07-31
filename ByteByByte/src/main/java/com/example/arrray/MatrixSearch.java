package com.example.arrray;

public class MatrixSearch {

	public static void main(String[] args) {
		int[][] mat =  {{ 1,  2, 3, 4},
						{ 5,  6, 7, 8},
						{ 9, 10,11,12},
						{13, 14,16,17},
						{18, 19,20,21}};
		
		System.out.println(contains(mat,15));

	}

	private static boolean contains(int[][] mat, int element) {
		if(mat.length==0||mat[0].length==0) return false;
		
		for (int i = 0; i < mat.length; i++) {
			int colLength = mat[i].length-1;
			for (int j = colLength; j >= 0; j--) {
				if(mat[i][j]<element) break;
				if(mat[i][j]>element) continue;
				if(mat[i][j]==element) return true;
			}
		}
		return false;
	}

}
