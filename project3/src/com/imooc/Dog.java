package com.imooc;

public class Dog extends Animal {

	public Dog() {
		// TODO Auto-generated constructor stub
		System.out.println("Dog");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("dog eat meal");
	}
	public void watchDoor(){
		System.out.println("dog can watch door");
	}

}
