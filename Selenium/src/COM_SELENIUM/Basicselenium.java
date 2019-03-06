package COM_SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;


public class Basicselenium {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maisoon Fathia\\workspace\\Selenium\\Driver\\chromedriver.exe");
			
	  WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement month_dropdown =driver.findElement(By.id("month"));
		
		Select month_dd = new Select (month_dropdown);
		//it will select March
		month_dd.selectByIndex(3);
		Thread.sleep(3000);
		
		month_dd.selectByValue("10");
		Thread.sleep(3000);
		month_dd.selectByVisibleText("Aug");
		
			

	}

}


