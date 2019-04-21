package com.example.string;

import java.util.Stack;

public class ParenthesisChecker {
	private static char paren[][] ={{'(',')'},
									{'{','}'},
									{'[',']'}
									};
	
	public static void main(String[] args) {
		String str = "({})[{]([]{})";
		if(checkParen(str))
			System.out.println("valid");
		else 
			System.out.println("invalid");
		
	}

	private static boolean checkParen(String str) {
		Stack<Character> stack = new Stack<>();
		for(char c:str.toCharArray()) {
			if (isOpenParen(c)) 
				stack.add(c);
			else if (stack.isEmpty() || !isMatchingParen(c,stack.pop())) 
				return false;
		}
		return true;
	}

	private static boolean isMatchingParen(char c, Character peek) {
		for (int i = 0; i < 3; i++) {
			if (paren[i][1]==c) 
				return peek==paren[i][0];
		}
		return false;
	}

	private static boolean isOpenParen(char c) {
		for (int i = 0; i < 3; i++) {
			if (c==paren[i][0]) 
				return true;
		}
		return false;
	}
}
