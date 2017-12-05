package question3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import question3.Definition;

public class Dictionary {
	List<Definition> dictionary = new ArrayList<Definition>();
	
	/**
	 * Constructor for the Dictionary class, creates a new dictionary from a file at a given path location 
	 * 		relative to this projects location.
	 * @param path
	 */
	public Dictionary(String path){
		try{
			File file = new File(path);
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = "";
            while((line = bufferedReader.readLine()) != null) {
            	String[] split = line.split(" – ");
            	if(split.length < 2){
            		split = line.split(" - ");
            	}
            	String[] defs = split[1].split(",");
            	for(int i = 0; i < defs.length; i++){
            		defs[i] = defs[i].trim();
            	}
            	this.addDefinition(new Definition(split[0], defs));
            }
            bufferedReader.close();
		} catch (FileNotFoundException e){
			System.out.println("File not found.");
		} catch (IOException e){
			System.out.println("I/O Exception.");
		}
	}
	
	/**
	 * Returns the dictionary as a String
	 */
	@Override
	public String toString(){
		String dictionaryStr = "";
		for(Definition def:this.getDictionary()){
			dictionaryStr += def.toString() + "\n";
		}
		return dictionaryStr.trim();
	}
	
	/**
	 * Adds a definition to the Dictionary
	 * @param def
	 */
	public void addDefinition(Definition def){
		dictionary.add(def);
	}
	
	/**
	 * Returns the dictionary
	 * @return
	 */
	public List<Definition> getDictionary(){
		return dictionary;
	}
}

