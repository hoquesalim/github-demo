package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

   public void login(String username, String password)
{
	   selconfig sel= new selconfig();
	   WebDriver driver =sel.driver;
	   
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);
	
	
}
}
