package COM_SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisible {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maisoon Fathia\\workspace\\Start\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/free-online-trial");
		driver.manage().window().maximize();
		
		boolean b1 = driver.findElement(By.id("start-trial-submit")).isDisplayed(); 
		System.out.println(b1);
		
	}

}
