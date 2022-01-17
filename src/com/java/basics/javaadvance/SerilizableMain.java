package com.java.basics.javaadvance;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerilizableMain {
	
	public static void main(String[] args) {
//		Person person1 = new Person("Praveen", 26, "BE");
//		Person person2 = new Person("Vikash", 26, "BE");
//		Person person3 = new Person("Nitish", 26, "BE");
		String fileName = "file.ser";
		
//		try {
//			FileOutputStream fileOutputStream = new FileOutputStream(fileName);
//			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//			
//			objectOutputStream.writeObject(person1);
//			objectOutputStream.writeObject(person2);
//			objectOutputStream.writeObject(person3);
//			
//			objectOutputStream.close();
//			fileOutputStream.close();
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Person deserPerson = null;
		
		try {
			FileInputStream fileInputStream = new FileInputStream(fileName);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			
			while(true) {
				try {
					deserPerson = (Person) objectInputStream.readObject();
					System.out.println(deserPerson);
				} catch (EOFException e) {
		            break;
		        }				
			}
			
			
			objectInputStream.close();
			fileInputStream.close();
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
