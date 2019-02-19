package com.java.developer.test;

interface Walk {
	void walk();
}


class ICanWalk implements Walk
{

	public void walk() {
		System.out.println("can walk");
		
	}
	
}


class ICannotWalk implements Walk
{

	public void walk() {
		System.out.println("cannot walk");
		
	}
	
}