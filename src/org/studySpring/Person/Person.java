package org.studySpring.Person;

public abstract class Person implements IsAlive,LiveLife{
	
	public void speak() {
		System.out.println("he/she can able to express their feelings");
	}
	
	@Override
	public void breathe() {
		System.out.println("he can able to breathe");
	}
	
	@Override
	public void message() {
		System.out.println("just live life happily ");
	}
	
	public abstract void eat();

}
