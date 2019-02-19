package com.java.developer.test;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testBird() {
		System.out.println("A bird \n");
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}
	
}
