package File_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write_to_file {

	public static void main(String[] args) {
		try {
			// Creating an object of a file
			File myObj = new File("C://Users//e5624267//git//PracticeBackup2021//Selenium//All Selenium + Java//Java//Core Java//ppp.txt"); 
			myObj.createNewFile();// create a file
			System.out.println("File created: " + myObj.getName());

			FileWriter myWriter = new FileWriter("C://Users//e5624267//git//PracticeBackup2021//Selenium//All Selenium + Java//Java//Core Java//ppp.txt");
			// Writes this content into the specified file
			myWriter.write("Writing to the file"); 			 
			// Closing is necessary to retrieve the resources allocated
			myWriter.close(); 
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}
}
