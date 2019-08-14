package com.example.string;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author mohammad.arif
 * Given a string and a dictionary HashSet, write a function to determine the minimum no of
 * characters to delete to make a word
 */
public class StringDeletion {

	public static void main(String[] args) {
		Set<String> dictionary = new HashSet<>();
		dictionary.add("abc");
		dictionary.add("lmn");
		dictionary.add("aabb");
		
		String str = "ajbic";
		System.out.println(getMinCharToDelete(dictionary, str));
	}

	private static int getMinCharToDelete(Set<String> dictionary, String str) {
		Queue<String> que = new LinkedList<>();
		Set<String> word = new HashSet<>();
		
		que.add(str);
		word.add(str);
		
		while (!que.isEmpty()) {
			String tmp = que.poll();
			word.remove(tmp);
			if (dictionary.contains(tmp))	return str.length()-tmp.length();
			for (int i = 0; i < tmp.length(); i++) {
				String newString = tmp.substring(0,i)+tmp.substring(i+1,tmp.length());
				if (!word.contains(newString)) {
					que.add(newString);
					word.add(newString);
				}
			}
		}
		return -1;
	}

}
