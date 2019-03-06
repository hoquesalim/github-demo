package Basicselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class practiceselenium {
	static WebDriver driver;
	
	public void openBrowser(String browserType, String url){
		String currentDir = System.getProperty("user.dir");
		if (browserType.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Maisoon Fathia\\workspace\\Selenium\\Driver\\geckodriver.exe");
			driver =  new FirefoxDriver();
		}
		else if (browserType.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maisoon Fathia\\workspace\\Selenium\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserType.equalsIgnoreCase("htmlunitdriver")){
			driver = new HtmlUnitDriver();
		}
		if (url.isEmpty(){
			url="About Blank";
		}
		driver.manage().window().maximize();
		driver.get(url);
	}
     public void closeBrowser(){
    	 if (driver !=null){
    		 driver.close();
    		 driver.quit();
    	 }
    public void testBrowser(){
    
    }
     }

	public static void main(String[] args) {
		

	}

}
