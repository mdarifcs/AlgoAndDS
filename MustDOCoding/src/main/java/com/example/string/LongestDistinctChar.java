package com.example.string;

import java.util.HashSet;
import java.util.Set;

public class LongestDistinctChar {

	public static void main(String[] args) {
		String str = "aldshflasghdfasgfkhgasdfasdgvfyweofyewyrtyefgv";
		System.out.println(lengthOfLongestDistinctSubString(str));
	}

	private static int lengthOfLongestDistinctSubString(String str) {
		int maxLen = 0, i = 0, j = 0;
		Set<Character> set = new HashSet<>();
		while (j < str.length()) {
			if (!set.contains(str.charAt(j))) {
				set.add(str.charAt(j++));
				maxLen = Integer.max(maxLen, j - i);
			} else 
				set.remove(str.charAt(i++));
		}
		return maxLen;
	}

}
