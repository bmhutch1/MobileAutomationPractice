package question2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePage {
	protected WebDriver driver;
	
	protected Map<String, String> createMap(List<WebElement> keyElements, List<WebElement> valueElements) throws Exception{
		Map<String, String> map = new HashMap<String,String>();
		if(keyElements.size() != valueElements.size()){
			throw new Exception("KeyElement size does not match valueElements size");
		}
		for(int i = 0; i < keyElements.size(); i++){
			map.put(keyElements.get(i).getText(), valueElements.get(i).getText());
		}
		return map;
	}
}
