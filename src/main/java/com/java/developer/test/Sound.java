package com.java.developer.test;


interface Sound {
	
	void sound();
}

class QuackSound implements Sound
{

	
	public void sound() {
		System.out.println(" says ");
		System.out.println("Quack, quack");
		
	}
	
}

class CluckSound implements Sound
{

	
	public void sound() {
		System.out.println(" says ");
		System.out.println("Cluck, cluck");
		
	}
	
}



class ICannotSound implements Sound {


	public void sound() {
		System.out.println("Silenece");

	}

}

class  CockdoodleSound implements Sound
{


	public void sound() {
		System.out.println("Cock-a-doodle-doo");
		
	}
	
}

class  WoofWoofSound implements Sound
{

	public void sound() {
		System.out.println("Woof, woof");
		
	}
	
}

class  MeowSound implements Sound
{
	
	public void sound() {
		System.out.println("Meow");
		
	}
	
}

class CustomSound implements Sound
{

	String sound;
	CustomSound(String sound)
	{
		this.sound=sound;
	}
	public void sound() {
		System.out.println(sound);
		
	}
	
}
