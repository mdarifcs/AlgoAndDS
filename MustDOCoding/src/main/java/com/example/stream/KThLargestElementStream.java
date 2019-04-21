package com.example.stream;

import java.util.PriorityQueue;
import java.util.Queue;

public class KThLargestElementStream {

	public static void main(String[] args) {
		int arr[] = {3,4};
		int k = 1;
		printLargest(arr,k);
	}

	private static void printLargest(int[] arr, int k) {
		Queue<Integer> que = new PriorityQueue<Integer>();
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for (; i < k-1; i++) {
			sb.append(-1+" ");
			que.add(arr[i]);
		}
		
		que.add(arr[k-1]);
		sb.append(que.peek()+" ");
		
		for (i=k; i < arr.length; i++) {
			if (arr[i]>que.peek()) {
				que.poll();
				que.add(arr[i]);
			}
			sb.append(que.peek()+" ");
		}
		System.out.println(sb.toString());
	}

}
