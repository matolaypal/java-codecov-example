package org.jacoco.examples.maven.java;

import java.util.Random;

public class HelloWorld {
	
	public String getMessage(boolean bigger) {
		if (bigger) {
			return "Hello Universe!";
		} else {
			return "Hello World!";
		}
	}

}
