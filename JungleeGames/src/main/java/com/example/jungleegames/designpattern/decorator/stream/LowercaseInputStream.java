package com.example.jungleegames.designpattern.decorator.stream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowercaseInputStream extends FilterInputStream{

	public LowercaseInputStream(InputStream in) {
		super(in);
	}

	@Override
	public int read() throws IOException {
		int c = in.read();
		return c==-1?c:Character.toLowerCase((char)c);
	}
}
