package question3;

import java.io.*;

public class Main {

	public static void main(String[] args){
		System.out.println("Does file 'src/noSuchFile.text' Exist: " + doesFileExist("src/question3/noSuchFile.text"));
		System.out.println("Does file 'src/file1.text' Exist: " + doesFileExist("src/question3/file1.txt"));
		System.out.println("Printing Dictionary:");
		printDictionary("src/question3/file1.txt");
	}
	
	/**
	 * Returns true if the file does exist, false otherwise 
	 * @param path
	 * @return
	 */
	public static boolean doesFileExist(String path){
		try{
			File file = new File(path);
			FileReader fileReader = new FileReader(file);
			System.out.println("File was found.");
			return true;
		} catch (FileNotFoundException e){
			System.out.println("File not found");
			return false;
		}
	}
	
	/**
	 * Prints the dictionary that is located at the path read in
	 * @param path
	 */
	public static void printDictionary(String path){
		if(doesFileExist(path)){
			Dictionary dictionary = new Dictionary(path);
			System.out.println(dictionary.toString());
		}
	}
}
