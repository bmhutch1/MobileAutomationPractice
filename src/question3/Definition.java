package question3;

/**
 * Definition Object, contains a word and it's definitions
 * 
 * @author Brandon Hutchinson
 */
public class Definition {
	String word;
	String[] definitions;
	
	/**
	 * Constructor for Definition Object
	 * 
	 * @param word
	 * @param defs
	 */
	public Definition(String word, String[] defs){
		this.word = word;
		this.definitions = defs;
	}
	
	/**
	 * Returns the full Definition of this object as a String
	 * 
	 * @return
	 */
	@Override
	public String toString(){
		String fullDefinitionStr = "";
		fullDefinitionStr = word;
		for(String str:definitions){
			fullDefinitionStr += "\n" + str;
		}
		return fullDefinitionStr;
	}
}
