package question2;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args){
		File file = new File(System.getProperty("user.dir") + "/test.html");
		Application app = new Application("file:" + file.getAbsolutePath());
		//System.out.println(app.getMainPage().getThirdAndFifthElements());
		app.getMainPage().printAllValues();
		app.closeApp();
	}
	
	public static void printOutThirdAndFifthElements(){
		Application app = new Application("file:///Users/hutch/Documents/test.html");
		
		List<WebElement> foods = app.getDriver().findElements(By.xpath("//*[@ng-bind='food.name']"));
			System.out.println(foods.get(2).getText());
			System.out.println(foods.get(4).getText());
		app.closeApp();
	}
}
