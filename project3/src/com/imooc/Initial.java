package com.imooc;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj1 = new Animal();
		Animal obj2 = new Dog();//父类的引用可以指向子类
		//Dog obj3 = new Animal();错
		obj1.eat();
		obj2.eat();
		Animal obj3 = new Cat();
		obj3.eat();
		
		Dog dog =new Dog();
		Animal animal = dog;//自动类型提升，向上类型转换
		Dog dog2 = (Dog)animal;//向下类型转换，强制类型转换
		if(animal instanceof Cat){
			Cat cat = (Cat)animal;//编译时 Cat类型 ，运行时Dog类型(animal指向Dog对象在内存中的地址)
		}else{
			System.out.println("无法进行类型转换");
		}
		
	}

}
