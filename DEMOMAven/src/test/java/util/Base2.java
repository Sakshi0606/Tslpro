package util;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class Base2 {

	public WebDriver driver;
	public KeyWords key;
  @BeforeTest(alwaysRun=true)
  public void beforeTest() {
	  key=new KeyWords(driver);

		  driver = key.browserStart("chrome");
		  //driver = key.browserStart("firefox");
		 

		//  driver = BrowserSetup.browserStart("firefox");

  }

  @AfterTest
  public void afterTest() {
  
  driver.quit();
  }

}
