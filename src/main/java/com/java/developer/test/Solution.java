package com.java.developer.test;


class Animal {
	Walk walk;
	Fly fly;
	Sing sing;
	Sound sound;
	Swim swim;
	
	Animal()
	{
		this.walk=new ICanWalk();
		this.sing=new ICannotSing();
		this.fly=new ICannotFly();
		this.sound = new ICannotSound();

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

class Duck extends Bird {
	
	Duck()
	{
		super();
		super.swim=new ICanSwim();
		super.sound=new QuackSound();	
	}

	void doSound()
	{
		sound.sound();
	}

	void doSwim()
	{
		swim.swim();
	}

}

class Chicken extends Bird  {
	
	Chicken()
	{
		super();
		this.fly=new ICannotFly();
		this.sound=new CluckSound();
		
	}
	Chicken(Sound sound)
	{
		super();
		this.fly=new ICannotFly();
		this.sound=sound;
		
	}
	void doSound()
	{
		sound.sound();
	}


}

class Rooster extends Animal{
	
	Chicken chicken;
	
	Rooster()
	{
		chicken=new Chicken(new CockdoodleSound());
		
	}
	
	void doSound()
	{
		chicken.doSound();
	}
}

class Parrot extends Bird {
	
	Sound sound;
	
	Parrot (){}
	Parrot(Sound sound)
	{
		this.sound=sound;
	}
	
	void doSound()
	{
		sound.sound();
	}
}

class Fish extends Animal
{

	Fish()
	{
		this.walk=new ICannotWalk();
		this.sing=new ICannotSing();
		this.swim=new ICanSwim();
		
	}
	
	void doWalk()
	{
		walk.walk();
	}
	void doSing()
	{
		sing.sing();
	}
	void doSwim()
	{
		swim.swim();
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
