package com.example.arrray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author mohammad.arif
 * Given a boolean matrix, update it so that if any cell is true,
 * all the rows and column in that are true.
 * [[1, 1, 1, 1], 
 *  [1, 1, 1, 1], 
 *  [1, 1, 0, 0]]
 */
public class ZeroMatrix {

	public static void main(String[] args) {
		int[][] mat = new int[][] { {1, 0, 0, 0},
									{0, 1, 0, 0},
									{0, 0, 0, 0}
								  };
		convertIntoResultMat(mat);
		System.out.println(Arrays.deepToString(mat));
	}

	private static void convertIntoResultMat(int[][] mat) {
		Set<MatIndex> set = new HashSet<MatIndex>();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j]==1) set.add(new MatIndex(i, j));
			}
		}
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				MatIndex mi = new MatIndex(i, j); 
				if (set.contains(mi)) updateMat(mat, mi); 
			}
		}
	}

	private static void updateMat(int[][] mat, MatIndex mi) {
		for (int i = 0; i < mat[mi.getColIndex()].length; i++) {
			mat[mi.getRowIndex()][i] = 1;
		}
		for (int i = 0; i < mat.length; i++) {
			mat[i][mi.getColIndex()] = 1;
		}
	}
	
	

}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
class MatIndex {
	private int rowIndex;
	private int colIndex;
}
