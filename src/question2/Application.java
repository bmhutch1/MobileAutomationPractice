package question2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application {

	WebDriver driver;
	MainPage mainPage;
	
	public Application(String url){
		
		String os = System.getProperty("os.name").toLowerCase();
		driver = new ChromeDriver();
		
		if(os.contains("mac")){
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/chromedriver");
		} else {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\chromedriver.exe");
		}

		driver.get(url);
		initPages();
	}
	
	public void closeApp(){
		driver.close();
	}
	
	private void initPages(){
		if(mainPage == null){
			mainPage = new MainPage(this);
		}
	}
	
	public WebDriver getDriver(){
		return driver;
	}
	
	public MainPage getMainPage(){
		return mainPage;
	}
}
