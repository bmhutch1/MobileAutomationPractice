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
	
	public String getFullDictionaryStr(){
		String dictionaryStr = "";
		for(Definition def:this.getDictionary()){
			dictionaryStr += def.getFullDefinition() + "\n";
		}
		return dictionaryStr.trim();
	}
	
	public void addDefinition(Definition def){
		dictionary.add(def);
	}
	
	public List<Definition> getDictionary(){
		return dictionary;
	}
}

