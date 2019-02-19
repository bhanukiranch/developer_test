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
		System.out.println("\n");
	}
	
	@Test
	public void testBirdDuckChicken() {
		System.out.println("A Duck \n");
		Duck duck = new Duck();
		duck.doSound();
		duck.doSwim();
		System.out.println("\n");
		System.out.println("A Chicken \n");
		Chicken chicken = new Chicken();
		chicken.doSound();
		chicken.fly();
		System.out.println("\n");
		
	}
	
}
