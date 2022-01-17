package com.java.basics.javaadvance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternizableMain {	
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String OUTPUT_FILE = "externalizable.ser";
		
		Country c = new Country();
	    c.setCode(374);
	    c.setName("Armenia");
	   
	    FileOutputStream fileOutputStream = new FileOutputStream(OUTPUT_FILE);
	    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
	    c.writeExternal(objectOutputStream);
	   
	    objectOutputStream.flush();
	    objectOutputStream.close();
	    fileOutputStream.close();
	   
	    FileInputStream fileInputStream = new FileInputStream(OUTPUT_FILE);
	    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
	   
	    Country c2 = new Country();
	    c2.readExternal(objectInputStream);
	   
	    objectInputStream.close();
	    fileInputStream.close();
	    
	    System.out.println(c2);
	}

}
