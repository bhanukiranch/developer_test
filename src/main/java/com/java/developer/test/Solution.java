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

class Shark extends Fish 
{
	
	void display()
	{
		System.out.println(" large and grey");
	}
	 
	void joke(){
		System.out.println(" can make Joke");
	}
}


class Clownfish extends Fish 
{
	
	void display()
	{
		System.out.println(" small and colourful (orange)");
	}
	
	void eat()
	{
		System.out.println("can eat other fishes");
	}
}

class Dolhpin extends Animal
{
	Fish fish=new Fish();
	Dolhpin()
	{
		super.swim=fish.swim;
	
	}
	
}

class Butterfly extends Bird
{
	Butterfly()
	{
		super(new ICanFly(), new ICannotSing());
	}
	
	void toCaterPillar()
	{
		this.sing=new ICannotSing();
		this.fly=new ICannotFly();
	}
}

class Frog extends Animal
{
	
}
class Dog extends Animal
{
	
}
class Cat extends Animal
{
	
}

public class Solution {

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		
		Animal[] animals = new Animal[]{ new Bird(),
		        new Duck(),
		        new Chicken(),
		        new Rooster(),
		        new Parrot(),
		        new Fish(),
		        new Shark(),
		        new Clownfish(),
		        new Dolhpin(),
		        new Frog(),
		        new Dog(),
		        new Butterfly(),
		        new Cat()
		};
		
		int fly=0,walk=0,sing=0,swim=0;
		for(Animal animal:animals)
		{
			if(animal.walk instanceof ICanWalk)
				walk=walk+1;
			
			if(animal.fly instanceof ICanFly)
				fly=fly+1;
			
			if(animal.sing instanceof ICanSing)
				sing=sing+1;
			
			if(animal.swim instanceof ICanSwim)
				swim=swim+1;
		}
		
		System.out.println("how many of these animals can fly? "+fly);
		System.out.println("how many of these animals can walk? "+walk);
		System.out.println("how many of these animals can sing? "+sing);
		System.out.println("how many of these animals can swim? "+swim);
	}
	
}
