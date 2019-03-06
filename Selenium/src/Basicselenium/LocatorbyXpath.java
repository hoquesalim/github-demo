package Basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorbyXpath {

		public static WebDriver driver=null;
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maisoon Fathia\\workspace\\Start\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("maisoon");
		
		
       
	}

}
