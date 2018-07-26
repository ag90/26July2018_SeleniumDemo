package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asserts {
	
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("HTTP://WWW.FREECRM.COM");
	  
/*	  driver.findElement(By.name("agreeTerms")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.name("submitButton")).click();
	  
	  String ActualErrorMsg=driver.findElement(By.xpath("//small[contains(text(),'Please enter your first name')]")).getText();
	  
	  
	  String ExpectedErrorMsg="Please enter your first name1";
	  
	  assertEquals(ActualErrorMsg, ExpectedErrorMsg);
	  Thread.sleep(1000);
	  
	  driver.findElement(By.name("agreeTerms")).click();
	  */
	  
	  
	  driver.navigate().to("https://www.freecrm.com/register/");
	  
	  driver.findElement(By.name("agreeTerms")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.name("submitButton")).click();
	  

	  String ActualErrorMsg1=driver.findElement(By.xpath("//small[contains(text(),'Please enter your first name')]")).getText();
	  
	  
	  String ExpectedErrorMsg1="Please enter your first name1";
	  
	  SoftAssert softassert=new SoftAssert();
	  softassert.assertEquals(ActualErrorMsg1, ExpectedErrorMsg1, "*** Invalid Error Msg Displayed ***");
	 
	  
	  driver.findElement(By.name("agreeTerms")).click();
	  Thread.sleep(1000);

	  
	 driver.quit();
	  
	 softassert.assertAll();
	  
	  
	 
	  
	  
	  
  }
}
