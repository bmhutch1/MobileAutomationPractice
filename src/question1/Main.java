package question1;

public class Main {

	public static void main(String[] args){
		System.out.println(reverseEverything("hope you are doing well"));
	}
	
	/**
	 * Reverses each word in the String s and reverses the entire string
	 * @param s - input string 
	 * @return the reversed String
	 */
	public static String reverseEverything(String s){
		char[] str = s.toCharArray();
		String reverseStr = "";
		for(int i = str.length - 1; i >= 0; i--){
			reverseStr += str[i];
		}
		return reverseStr;
	}
}
