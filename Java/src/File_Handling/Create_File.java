package File_Handling;

import java.io.File;
import java.io.IOException;

public class Create_File {

	public static void main(String[] args) {
		try {
			// Creating an object of a file
			File myObj = new File("C://Users//e5624267//git//PracticeBackup2021//Selenium//All Selenium + Java//Java//Core Java//ppp.txt"); 
			myObj.createNewFile();
			System.out.println("File created: " + myObj.getName());

		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
