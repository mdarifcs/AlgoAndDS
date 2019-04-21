package com.example.string;

import java.util.Set;
import java.util.TreeSet;

public class PermutationOfString {
	
	/*
	 * for indexed based solution, watch the following video
	 * https://www.youtube.com/watch?v=IPWmrjE1_MU
	 */	
	
	public static void main(String[] args) {
		String str = "ABC";
		Set<String>  result = new TreeSet<>();
		permutations("",str,result);
		StringBuffer sb = new StringBuffer();
		for (String res : result) 
			sb.append(res+" ");
		System.out.println(sb.toString().trim());
	}

	private static void permutations(String prefix, String suffix, Set<String> result) {
		if (suffix.length()==0) { 
			result.add(prefix);
		} else {
			for (int i = 0; i < suffix.length(); i++) {
				permutations(prefix+suffix.charAt(i), suffix.substring(0,i)+suffix.substring(i+1, suffix.length()), result);
			}
		}
	}
}
