package com.java.developer.test;

interface Swim {
	
	void swim();
}

class ICanSwim implements Swim{

	
	public void swim() {
		System.out.println("can Swim");
		
	}
	
}
class ICannotSwim implements Swim{
	
	
	public void swim() {
		System.out.println("cannot Swim");
		
	}
}
