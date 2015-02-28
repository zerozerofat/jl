package com.imooc.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DisDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String file = "D:\\java\\FileIo\\demo\\dos.txt";
		IOUtil.printHex(file);
		DataInputStream dis = new DataInputStream(new FileInputStream(file));
		int i = dis.readInt();
		System.out.println(i);
		i = dis.readInt();
		System.out.println(i);
		long l = dis.readLong();
		System.out.println(l);
		double d = dis.readDouble();
		System.out.println(d);
		String s = dis.readUTF();
		System.out.println(s);
	}

}