package question2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Creates the WebDriver object and initializes the pages 
 * 
 * @author Brandon Hutchinson
 */
public class Application {

	private WebDriver driver;
	private MainPage mainPage;
	
	/**
	 * Constructor for Application, creates a WebDriver instance and navigates to the URL passed in
	 * 
	 * @param url
	 */
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
