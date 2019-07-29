package com.example.string;

import java.util.ArrayList;
import java.util.List;

public class PermutationString {

	public static void main(String[] args) {
		String str = "abcd";
		System.out.println(getPermutations(str));
	}

	public static List<String> getPermutations(String str) {
		List<String> result = new ArrayList<String>();
		getPermutations("", str, result);
		return result;
	}

	private static void getPermutations(String prefix, String suffix, List<String> result) {
		if (suffix.length()==0) {
			result.add(prefix);
			return;
		}
		
		for (int i = 0; i < suffix.length(); i++) {
			getPermutations(prefix+suffix.charAt(i), suffix.substring(0,i)+suffix.substring(i+1, suffix.length()), result);
		}
	}

}
