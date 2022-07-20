package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputEx {
	public static void main(String[] args) {
		System.out.print("hello");
		try {
			FileInputStream input = new FileInputStream("target/input1.txt");
			int i=0;
			while((i=input.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
