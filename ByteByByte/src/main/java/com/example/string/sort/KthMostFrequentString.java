package com.example.string.sort;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author mohammad.arif
 * Given a list of strings, write a function to find the kth most frequent recurring string
 */
public class KthMostFrequentString {

	public static void main(String[] args) {
		String[] str = new String[] {"a","c","a","c","d","b","a"};
		System.out.println(findMostFrequent(str,3));
	}

	private static String findMostFrequent(String[] str, int k) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String s : str) {
			Integer val = map.get(s);
			if (val==null) val=0;
			map.put(s, ++val);
		}
		return (map.size()<k)?null:getMostFrequentFromMapUsingQueue(map,k);
	}

	private static String getMostFrequentFromMapUsingQueue(Map<String, Integer> map, int k) {
		Queue<Map.Entry<String, Integer>> que = new PriorityQueue<>((o1, o2)-> o1.getValue().compareTo(o2.getValue()));
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if(k>0) {
				que.add(entry);
				k--;
			} else if (entry.getValue()>que.peek().getValue()) {
				que.poll();
				que.add(entry);
			}
		}
		return que.poll().getKey();
	}

}
