package Basicselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browservalidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maisoon Fathia\\workspace\\Start\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Google"))
		{
			System.out.println("Correct Title");
			
			
		}
		else
		{
			System.out.println("In+Correct Title");	
		}
		System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());
		//driver.quit();
	}

}
