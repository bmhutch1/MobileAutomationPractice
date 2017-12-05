package question3;

public class Definition {
	String word;
	String[] definitions;
	
	public Definition(String word, String[] defs){
		this.word = word;
		this.definitions = defs;
	}
	
	public String getFullDefinition(){
		String fullDefinitionStr = "";
		fullDefinitionStr = word;
		for(String str:definitions){
			fullDefinitionStr += "\n" + str;
		}
		return fullDefinitionStr;
	}
}
