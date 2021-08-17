package com.aaron.learningfilereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("myFile.txt");

		try (FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);){
			
			String line = bufferedReader.readLine();
			while(line!=null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File Not Found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem reading the File"+file.getName());
		} 
		
	}

}
