package com.imooc.test;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s1 = "imooc";
	String s2 = "imooc";
	String s3 = new String("imooc");
	String s4 = new String("imooc");
	System.out.println(s1==s2);//true
	System.out.println(s2==s3);//false
	System.out.println(s3==s4);//false
	System.out.println(s3.equals(s4));//true	
	System.out.println(s2.equals(s3));//true

	}

}
