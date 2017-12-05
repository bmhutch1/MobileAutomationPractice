package question1;
import static org.junit.Assert.*;
import org.junit.Test;

public class Tests {

	/**
	 * Test the method reverseEverything(String s) 
	 * 
	 * Question 1
	 */
	@Test
	public void test() {
		assertEquals("llew gniod era uoy epoh", Main.reverseEverything("hope you are doing well"));
		assertEquals("teerts eht dessorc tac kcalb eht", Main.reverseEverything("the black cat crossed the street"));
		assertEquals("erutnevda na no og stel", Main.reverseEverything("lets go on an adventure"));
	}
}
