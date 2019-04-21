package com.example.array;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaxOfAllSubArr {

	public static void main(String[] args) {
		int arr[] = { 3, 2, 1, 1, 4, 5, 2, 3, 6 };
		printResultUsingQueue(arr, 3);
	}

	private static void printResultUsingQueue(int arr[], int k) {
		Queue<Integer> priorityQue = new PriorityQueue<Integer>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return -o1.compareTo(o2);
			}
		});
		int lastElement = arr[0];
		int i = 0;
		for (; i < k; i++) 
			priorityQue.add(arr[i]);
		StringBuilder sb = new StringBuilder();
		sb.append(priorityQue.peek()+" ");
		for (; i < arr.length; i++) {
			priorityQue.add(arr[i]);
			priorityQue.remove(lastElement);
			sb.append(priorityQue.peek()+" ");
			lastElement = arr[i-k+1];
		}
		System.out.println(sb.toString());
		
	}

}
