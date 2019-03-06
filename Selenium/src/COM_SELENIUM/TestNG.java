package COM_SELENIUM;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {

	public void salim()
	{
		System.out.println("From Salim Method");
	}
 @Test
 public void  testmethod(){
	 salim();
	 System.out.println("From the test method");
	 
	  
}
 @BeforeTest
 public void Beforemethod(){
	 System.out.println("From the Before method");
 }
 
/* @AfterTest
 public void AfterTest(){
	 System.out.println("From the After method");
 } */
}
