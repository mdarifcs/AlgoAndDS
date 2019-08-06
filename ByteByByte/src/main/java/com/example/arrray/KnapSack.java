package com.example.arrray;

/**
 * @author mohammad.arif
 *  p {6, 10, 12}
 *	w {1,  2,  3} max_weight = 5
 *	
 *				0	1	2	3	4	5
 *	p	w	0	0	0	0	0	0	0
 *	6	1	1	0	6	6	6	6	6	2-2=0
 *	10	2	2	0	6	10	16	16	16	5-3=2
 *	12	3	3	0	6	10	12	18	22	5
 *	
 *	{0	1	1}
 *	
 *	######################################################
 *	p {1, 2, 5, 6} 
 *	w {2, 3, 4, 5} total_weitgh=8
 *	
 *				0	1	2	3	4	5	6	7	8
 *	p	w	0	0	0	0	0	0	0	0	0	0	
 *	1	2	1	0	0	1	1	1	1	1	1	1	3-3=0
 *	2	3	2	0	0	1	2	2	3	3	3	3	8-5=3
 *	5	4	3	0	0	1	2	5	6	6	7	7	8-5=3
 *	6	5	4	0	0	1	2	5	6	6	7	8	8
 *	
 *	{0	1	0	1}
 */
public class KnapSack {

	public static void main(String[] args) {
		int[] weights = new int[]{1,2,3};
		int[] values = new int[]{6,10,12};
		int w=5;
//		int[] weights = new int[]{2, 3, 4, 5};
//		int[] values = new int[]{1, 2, 5, 6};
//		int w=8;
		System.out.println(knapsack(w, weights, values));
		System.out.println(knapsackDP(w, weights, values));
	}

	private static int knapsackDP(int w, int[] weights, int[] values) {
		int length = weights.length; // it could be either weight length or values length
		int[][] cache = new int[length+1][w+1];
		for (int i = 1; i <= length; i++) {
			for (int j = 1; j <= w; j++) {
				if (weights[i-1]>j) cache[i][j]=cache[i-1][j];
				else cache[i][j]=Math.max(cache[i-1][j], cache[i-1][j-weights[i-1]]+values[i-1]);
			}
		}
		return cache[weights.length][w];
	}

	private static int knapsack(int w, int[] weights, int[] values) {
		return knapsack(w, weights, values, 0);		
	}

	private static int knapsack(int w, int[] weights, int[] values, int index) {
		if (index==weights.length) return 0;
		if (w-weights[index]<0) return knapsack(w, weights, values, index+1);
		
		int include = knapsack(w-weights[index], weights, values, index+1)+values[index];
		int exclude = knapsack(w, weights, values, index+1);
		
		return Math.max(include, exclude);
	}

}
