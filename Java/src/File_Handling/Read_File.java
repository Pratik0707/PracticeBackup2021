package File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_File {

	public static void main(String[] args) {
		try{
			File myObj = new File("C://Users//e5624267//git//PracticeBackup2021//Selenium//All Selenium + Java//Java//Core Java//ppp.txt"); 
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine())
			{
				String data = myReader.nextLine();
				System.out.println("FIle data is : "+data);
			}
			myReader.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}

