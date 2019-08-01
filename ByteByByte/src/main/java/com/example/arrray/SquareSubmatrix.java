package com.example.arrray;

/**
 * @author mohammad.arif
 * Given a 2D array of 1s and 0s, find the largest square subarray of all 1s.
 */
public class SquareSubmatrix {

	public static void main(String[] args) {
		int[][] mat = {{1, 1, 1, 0},
					   {1, 1, 1, 1},
					   {1, 1, 1, 0}};
		System.out.println(largestSquareSubMat(mat));
	}

	private static int largestSquareSubMat(int[][] mat) {
		int rowCount = mat.length;
		int colCount = mat[0].length;
		int result = 0;
		
		if(rowCount==0 || colCount==0) return 0;
		
		int[][] resultMat = new int[rowCount][colCount];
		
		for (int i = 0; i < resultMat.length; i++) {
			for (int j = 0; j < resultMat[i].length; j++) {
				if(i==0||j==0)
					resultMat[i][j] = mat[i][j];
				else if (mat[i][j]==1) 
					resultMat[i][j] = getMin(resultMat[i-1][j], resultMat[i][j-1], resultMat[i-1][j-1]) + 1;
				if (result<resultMat[i][j])
					result = resultMat[i][j];
			}
		}
		return result;
	}

	private static int getMin(int ... val) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < val.length; i++) {
			if (val[i]<min) 
				min = val[i];
		}
		return min;
	}
}
