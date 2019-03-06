package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.LoginPage;
import config.selconfig;

public class sampletest {
	static WebDriver driver;
	public static void main(String[] args) {
		selconfig sc = new selconfig();
		sc.openBrowser();
		LoginPage l = new LoginPage();
		l.login("ramesh", "ramesh-passwor");
		
		/*String driverpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", driverpath+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");	
		//driver.manage().window().maximize();*/
		//sampletest t = new sampletest();
		//t.login("ramesh", "ramesh-password");
	} 

	/*public void login(String username,String password){
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		*/

	}






