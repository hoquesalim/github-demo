


package COM_SELENIUM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowser {

	public static void main(String[] args) {
		
		// chrome browser
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maisoon Fathia\\workspace\\Selenium\\Driver\\chromedriver.exe");
	
		
		// Firefox browser
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Maisoon Fathia\\workspace\\Selenium\\Driver\\geckodriver.exe");
				
	// IEBrowser 
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maisoon Fathia\\workspace\\Selenium\\Driver\\chromedriver.exe");
			
	
	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
	//	driver.quit();
		
		

	}

}







