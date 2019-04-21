package com.example.array;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortElementByFrequency {

	public static void main(String[] args) {
		int arr[] = {5,5,4,6,4,8,8,8,7,7,7,300,300,300,290,290,290};
		sortElement(arr);
	}

	private static void sortElement(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) 
				map.put(arr[i], map.get(arr[i])+1);
			else 
				map.put(arr[i], 1);	
		}
		
		List<Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer,Integer>>(map.entrySet());
		Collections.sort(list, (o1, o2) -> {
				int compareValue = -o1.getValue().compareTo(o2.getValue());
				if (compareValue!=0) {
					return compareValue;
				}
				return o1.getKey().compareTo(o2.getKey());
			});
		
		StringBuilder sb = new StringBuilder();
		for (Entry<Integer, Integer> entry : list) {
			for (int i = 0; i < entry.getValue(); i++) {
				sb.append(entry.getKey()+" ");
			}
		}
		System.out.println(sb.toString());
	}

}
