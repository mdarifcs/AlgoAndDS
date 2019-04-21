package com.example.string;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	private static Map<Character, Integer> map = new HashMap<>();
	static{
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
	}
	
	public static void main(String[] args) {
		String roman = "XXIX";
		System.out.println(getInteger(roman));
	}

	private static Integer getInteger(String roman) {
		Integer num = 0;
		for (int i = 0; i < roman.length(); i++) {
			if (i<roman.length()-1 && map.get(roman.charAt(i+1))>map.get(roman.charAt(i))) 
				num -= map.get(roman.charAt(i));
			 else 
				num += map.get(roman.charAt(i));
		}
		return num;
	}

}
