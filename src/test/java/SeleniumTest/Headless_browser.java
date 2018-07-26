package SeleniumTest;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class Headless_browser {
	
	WebDriver driver;
	
	@Test
	public void headless_browser(){
		
	/*System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
	driver=new HtmlUnitDriver();*/


	System.setProperty("phantomjs.binary.path", "C:\\Avi Gupta\\Automation\\Automation Software\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
	driver=new PhantomJSDriver();
	
	driver.get("http://www.freecrm.com");
	
	System.out.println(driver.getTitle());
	
	}

}
