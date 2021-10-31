package Basics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_ {

	public static void main(String[] args) throws IOException {
		FileOutputStream ff = new FileOutputStream("C://Users//e5624267//git//PracticeBackup2021//Selenium//All Selenium + Java//Java//Core Java//prt.txt");
		//it creates file in above line
		String ss = "Created a new file for read write";
		byte[]b = ss.getBytes();
		ff.write(b);//it accepts byte array as input
		//read from file
		File file = new File("C://Users//e5624267//git//PracticeBackup2021//Selenium//All Selenium + Java//Java//Core Java//prt.txt");
		FileInputStream inputStream = new FileInputStream(file);
		byte bytes[] = new byte[(int) file.length()];
		//Reading data into the byte array
		int i;
		System.out.println("Data from file is : ");
		while ((i = inputStream.read()) != -1) {
            System.out.print((char) i);
        }
	}

}
