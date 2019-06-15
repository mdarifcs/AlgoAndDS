package com.example.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MianTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 10);
		map.put("b", 60);
		map.put("c", 90);
		map.put("d", 40);
		map.put("e", 50);
		map.put("f", 20);
		map.put("g", 70);
		map.put("j", 80);
		map.put("k", 30);
		map.put("l", 100);
		System.out.println(map);
		Map<String, Integer> retMap = sortMapByValue(map);
		System.out.println(retMap);
	}

	private static Map<String, Integer> sortMapByValue(Map<String, Integer> map) {
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		System.out.println(list);
		Map<String, Integer> linkedMap = new LinkedHashMap<>();
		for (Entry<String, Integer> entry : list) {
			linkedMap.put(entry.getKey(), entry.getValue());
		}
		return linkedMap;
	}

}
