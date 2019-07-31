package com.example.arrray;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class MergeKSortedArrays {

	public static void main(String[] args) {
		int[][] arrays = {{1, 4, 7},
						  {2, 5, 8},
						  {3, 6, 9},
						  {},
						  {23,56,89},
						  {20,30,40},
						  {11,35,55,60,65,78,90,100}};
		int[] result = sortArrays(arrays);
		System.out.println(Arrays.toString(result));
	}

	private static int[] sortArrays(int[][] arrays) {
		int arraysLength = 0;
		Queue<QueueNode> pq = new PriorityQueue<QueueNode>();
		for(int i=0; i<arrays.length; i++) {
			arraysLength += arrays[i].length;
			if (arrays[i].length>0) 
				pq.add(new QueueNode(i, 0, arrays[i][0]));
		}
		int[] result = new int[arraysLength];
		int resultIndex = 0;
		
		while (!pq.isEmpty()) {
			QueueNode qn = pq.poll();
			result[resultIndex++] = qn.getValue();
			qn.setIndex(qn.getIndex()+1);
			if(qn.getIndex()<arrays[qn.getArray()].length) {
				qn.setValue(arrays[qn.getArray()][qn.getIndex()]);
				pq.add(qn);
			}
		}
		return result;
	}
}

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class QueueNode implements Comparable<QueueNode>{
	private int array;
	private int index;
	private int value;
	@Override
	public int compareTo(QueueNode qn) {
		if(this.value>qn.value) return 1;
		if(this.value<qn.value) return -1;
		return 0;
	}
}