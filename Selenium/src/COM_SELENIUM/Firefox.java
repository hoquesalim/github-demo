package COM_SELENIUM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Maisoon Fathia\\workspace\\Selenium\\Driver\\geckodriver.exe");

     WebDriver driver = new FirefoxDriver();
     driver.get("https://www.google.com");
     String title = driver.getTitle();
      System.out.println(title);
	 if (title.equals("Google")){
		 System.out.println("Correct Title");
	 }
	 else 
		 System.out.println("In-Correct Title");
	}

}

		
		

	


