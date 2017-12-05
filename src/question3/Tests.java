package question3;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tests {

	/**
	 * Tests doesFileExist() method.
	 * 
	 * Question 3, part a
	 */
	@Test
	public void testDoesFileExistMethod() {
		assertEquals(false, Main.doesFileExist(""));
		assertEquals(false, Main.doesFileExist("fileNotFound"));
		assertEquals(false, Main.doesFileExist("file1"));
		assertEquals(true, Main.doesFileExist("src/question3/file1.txt"));
		assertEquals(true, Main.doesFileExist("src/question3/file2.txt"));
	}
	
	/**
	 * Tests the toString method of the Dictionary Object.
	 * 
	 * Question 3, part b
	 */
	@Test
	public void testPrintDictionary() {
		Dictionary dict1 = new Dictionary("");
		assertEquals("", dict1.toString());
		Dictionary dict2 = new Dictionary("fileNotFound");
		assertEquals("", dict2.toString());
		Dictionary dict3 = new Dictionary("src/question3/file1.txt");
		assertEquals("Apple\na fruit\na tech firm\nTable\nan object\n" 
				+ "contains rows and columns when used in context of computers\nOrange\na fruit",
				dict3.toString());
		Dictionary dict4 = new Dictionary("src/question3/file2.txt");
		assertEquals("Pineapple\na fruit\nBat\nan animal\n"
				+ "a wooden stick that is used to play baseball\na sharp blow\nGoogle"
				+ "\ntech company\nto search something on the Internet.",
				dict4.toString());
	}
}
