package com.java.developer.test;

import com.developer.java.SoundBehaviour;

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