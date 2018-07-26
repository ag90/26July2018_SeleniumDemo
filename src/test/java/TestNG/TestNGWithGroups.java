package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class TestNGWithGroups {
	
	WebDriver driver;
	ChromeOptions Options;
	
	  @Test(groups="LoginPage")
	  public void FreeCrmPage() {
		  
		  String Title=driver.getTitle();
		  System.out.println(Title);
	  }
	  
	  @Test(groups="LoginPage")
	  public void FreeCrmLoginPage() throws InterruptedException {
		  
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenk");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		
	  }
	  
	  @Test(groups="HomePage")
	  public void FreeCrmHomePage() throws InterruptedException {
		  driver.switchTo().frame("mainpanel");
		  Thread.sleep(2000);
		boolean SearchImage= driver.findElement(By.xpath("//input[@type='image']")).isDisplayed();
		System.out.println(SearchImage);
		
	  }
	   
	  @Test(groups="HomePage")
	  public void FreeCrmHomeCallPage() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		
	  }
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
	  Options=new ChromeOptions();
	  Options.addArguments("disable-infobars");
	  driver=new ChromeDriver(Options);
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.get("http://www.freecrm.com");
	  
	  
  }

}
