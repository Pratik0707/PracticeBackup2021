package File_Handling;

import java.io.File;
import java.io.IOException;

public class Delete_File {

	public static void main(String[] args) throws IOException {
		File file = new File("C://Users//e5624267//git//PracticeBackup2021//Selenium//All Selenium + Java//Java//Core Java//ppp_delete.txt");
		file.createNewFile();// create a file
		System.out.println("File created: " + file.getName());
		if(file.delete())//delete a file
		{
			System.out.println("File deleted successfully");
		}
		else
		{
			System.out.println("Failed to delete the file");
		}
	}
} 


