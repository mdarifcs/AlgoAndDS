package com.example.arrray;

/**
 * @author mohammad.arif
 * Given a matrix, find the path from top left to bottom right with the greatest product
 * by moving only down and right
 * 
 * [1, 2, 3]
 * [4, 5, 6]
 * [7, 8, 9]
 * 
 * 1->4->7->8->9
 * 2016
 * 
 * [-1, 2,  3]
 * [4,  5, -6]
 * [7,  8,  9]
 * 
 * -1->4->5->-6->9
 * 1080
 */

//only positive matrix implementation 640000
public class MatrixProduct {
	public static void main(String[] args) {
		int[][] mat = new int[][]  {{1, 10, 80},
									{4, 5, 20},
									{7, 8, 40}};
		System.out.println(getMaxProduct(mat));
	}

	private static int getMaxProduct(int[][] mat) {
		int rowLength = mat.length;
		int colLength = mat[0].length;
		int[][] result = new int[rowLength][colLength];
		
		for (int i = 0; i < rowLength; i++) {
			for (int j = 0; j < colLength; j++) {
				if (i==0 && j==0) result[i][j] = mat[i][j];
				else if (i==0) result[i][j] = mat[i][j-1]*mat[i][j];
				else if (j==0) result[i][j] = mat[i-1][j]*mat[i][j];
				else result[i][j] = Math.max(result[i][j-1], result[i-1][j])*mat[i][j];
			}
		}
		return result[rowLength-1][colLength-1];
	}
}
