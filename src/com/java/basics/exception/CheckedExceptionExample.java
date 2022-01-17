package com.java.basics.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionExample {

	public static void main(String args[]) {  

		FileInputStream file_data = null;          
		try 
		{
			file_data = new FileInputStream("C:/Users/ajeet/OneDrive/Desktop/Hello.txt");
			int m;
			while(( m = file_data.read() ) != -1) {  
				System.out.print((char)m);  
			}

			file_data.close(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  

	}  

}
