package question3;

import java.io.*;

public class Main {

	public static void main(String[] args){
		printDictionary("src/file2.txt");
	}
	
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
	
	public static void printDictionary(String path){
		if(doesFileExist(path)){
			Dictionary dictionary = new Dictionary(path);
			System.out.println(dictionary.getFullDictionaryStr());
		}
	}
}
