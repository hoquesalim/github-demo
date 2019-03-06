package Basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
		public static WebDriver driver=null;
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maisoon Fathia\\workspace\\Start\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Frames.html");
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("maisoon");
			
			
		
		
		
       
	}

}


	


