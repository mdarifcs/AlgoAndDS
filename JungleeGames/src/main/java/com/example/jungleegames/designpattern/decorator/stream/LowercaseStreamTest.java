package com.example.jungleegames.designpattern.decorator.stream;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowercaseStreamTest {
	public static void main(String[] args) throws IOException {
		int c;
		
		InputStream in = new LowercaseInputStream(new BufferedInputStream(System.in));
		while ((c=in.read())>=0) {
			System.out.print((char)c);
		}
		in.close();
	}
}
