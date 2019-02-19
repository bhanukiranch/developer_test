package com.java.developer.test;

interface Sing {
	
	void sing();

}

class ICanSing implements Sing
{

	public void sing() {
		System.out.println("can sing");
		
	}

}

class ICannotSing implements Sing
{

	public void sing() {
		System.out.println("cannot sing");
		
	}
	
}
