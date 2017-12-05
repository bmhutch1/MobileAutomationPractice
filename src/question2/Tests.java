package question2;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Test;

public class Tests {

	/**
	 * Tests getThirdAndFifthElements method
	 * 
	 * Question 2, part a
	 */
	@Test
	public void printThirdAndFifthElement(){
		File file = new File(System.getProperty("user.dir") + "/test.html");
		Application app = new Application("file:" + file.getAbsolutePath());
		String str = "";
		System.out.println(str = app.getMainPage().getThirdAndFifthElements());
		assertEquals("Applesauce, unsweetened\nJuice, Cranberry-apple drink", str);
		app.closeApp();
	}
	
	/**
	 * Tests getAllElementsAsString method
	 * 
	 * Question 2, part b
	 */
	@Test
	public void printAllElementsOnPage(){
		File file = new File(System.getProperty("user.dir") + "/test.html");
		Application app = new Application("file:" + file.getAbsolutePath());
		String str= "";
		System.out.println(str = app.getMainPage().getAllElementsAsString());
		assertEquals(true, str.contains("Apple(s) fresh: 1 medium"));
		assertEquals(true, str.contains("Apple(s), dried: 1/4 cup(s)"));
		assertEquals(true, str.contains("Juice, Cranberry-apple drink: 8 fl oz"));
		assertEquals(true, str.contains("Applesauce, unsweetened: 1/2 cup(s)"));
		assertEquals(true, str.contains("Apple butter: 1 Tbsp"));
		app.closeApp();
	}
}
