package COM_SELENIUM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class Chrome_Practice {



	public static void main(String[] args) {
		//configure the driver
		//String.driverPath = System.getProperty("user.dir")
	//	String.driverPath = System.getProperty("user.dir");
	//	System.out.println(driverPath);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maisoon Fathia\\workspace\\Selenium\\Driver\\chromedriver.exe");
		
		
		//C:\\Users\\Maisoon Fathia\\workspace\\Selenium\\
	//	System.setProperty("webdriver.chrome.driver", "\\Driver\\chromedriver.exe");
			
	  WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
	//	driver.quit();
		
		

	}

}
