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
	
	public String getThirdAndFifthElements(){
		String str = "";
		List<WebElement> keys = driver.findElements(foodName);
		str = keys.get(2).getText() + "\n" + keys.get(4).getText();
		return str;
	}
	
	public void printAllValues(){
		List<WebElement> keys = driver.findElements(foodName);
		List<WebElement> values = driver.findElements(foodServings);
		try {
			Map<String,String> map = this.createMap(keys, values);
			for (Map.Entry<String, String> e : map.entrySet())
			    System.out.println(e.getKey() + ": " + e.getValue());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
