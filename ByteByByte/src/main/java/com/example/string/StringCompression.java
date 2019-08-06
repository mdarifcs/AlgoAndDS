package com.example.string;

/**
 * @author mohammad.arif
 * Given a string, write a function to compress it by shortening every sequence of the same
 * character followed by the no of repetitions, if the compressed string is longer than original,
 * you should return original string
 */
public class StringCompression {

	public static void main(String[] args) {
		String str = "aaabbccccbbaaaaa";
		String compressStr = compress(str);
		System.out.println("original: "+str+" compressed: "+compressStr);
		
	}

	private static String compress(String str) {
		if (str==null || str.length()<=2) return str;
		StringBuilder sb = new StringBuilder();
		int i = 0;
		int j = 1;
		int count = 1;
		char[] charArray = str.toCharArray();
		while (j<str.length()) {
			if (charArray[i]==charArray[j]) {
				count++;
				j++;
			} else {
				sb.append(charArray[i]+""+count);
				count = 1;
				i=j;
				j++;
			}
		}
		sb.append(charArray[i]+""+count);
		return sb.toString().length()<str.length()?sb.toString():str;
	}

}
