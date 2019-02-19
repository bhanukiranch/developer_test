package com.java.developer.test;


class Animal {
	Walk walk;
	Fly fly;
	Sing sing;
	
	Animal()
	{
		this.walk=new ICanWalk();
		this.sing=new ICannotSing();
		this.fly=new ICannotFly();

	}
	
	Animal(Walk walk)
	{
		this.walk=walk;
	}
	
    void walk(){
    	walk.walk();
    	}
}

class Bird extends Animal {
	
	Bird()
	{
		super.fly=new ICanFly();
		super.sing=new ICanSing();
	}
	
	Bird(Fly fly,Sing sing)
	{
		super.fly=fly;
		super.sing=sing;
	}
	
	void fly()
	{
		fly.fly();
		
	}
	
	void sing()
	{
		sing.sing();
	}
	
}

public class Solution {

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}
	
}
