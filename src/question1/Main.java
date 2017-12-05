package question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string to reverse:");
		String str = scanner.nextLine();
		scanner.close();
		System.out.println("Reversed String: " + reverseEverything(str));
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
