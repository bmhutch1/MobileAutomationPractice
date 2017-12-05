package question2;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage{

	private final By foodName = By.xpath("//*[@ng-bind='food.name']");
	private final By foodServings = By.xpath("//*[@ng-bind='food._servingDesc']");
	
	protected MainPage(Application app){
		driver = app.getDriver();
	}
	
	/**
	 * Returns a String containing the third and fifth food elements
	 * @return
	 */
	public String getThirdAndFifthElements(){
		String str = "";
		List<WebElement> keys = driver.findElements(foodName);
		str = keys.get(2).getText() + "\n" + keys.get(4).getText();
		return str;
	}
	
	/**
	 * Returns all of the food elements with the pairing serving size as a String 
	 * @return
	 */
	public String getAllElementsAsString(){
		String str = "";
		List<WebElement> keys = driver.findElements(foodName);
		List<WebElement> values = driver.findElements(foodServings);
		try {
			Map<String,String> map = this.createMap(keys, values);
			for (Map.Entry<String, String> e : map.entrySet())
			    str += e.getKey() + ": " + e.getValue() + "\n";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str.trim();
	}
}
