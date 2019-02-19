package com.java.developer.test;

interface Fly {
	
	void fly();

}

class ICanFly implements Fly
{

	public void fly() {
		System.out.println("can fly");
		
	}
	
}


class ICannotFly implements Fly
{

	public void fly() {
		System.out.println("cannot fly");
		
	}
	
}
