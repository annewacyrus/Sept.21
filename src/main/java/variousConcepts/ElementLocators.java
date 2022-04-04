package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {
	WebDriver driver;

	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\wa_ng\\OneDrive\\Desktop\\SELENIUM\\Maven\\Session2a\\driver\\chromedriver.exe");
		// launch of webBrowser session
		// WebDriver driver = new ChromeDriver();//define driver as global variable to
		// be used in other methods; remove the WebDriver; DECLARED UNDER PUBLIC CLASS
		driver = new ChromeDriver();// define driver as global variable to be used in other methods
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void testLocators() throws InterruptedException {
//		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
//		driver.navigate().back();
//		driver.findElement(By.partialLinkText("TF-API")).click();
		//driver.findElement(By.partialLinkText("Product")).click();//testing for any word within a link; gives the same as entire link
        
//		driver.findElement(By.cssSelector("input#sex-1")).click();   //use String as the value/confirmed the value of radio button as female
		driver.findElement(By.cssSelector("input#sex-0")).click();   //confirm the other value of sex as male
		driver.findElement(By.cssSelector("input[value='3']")).click(); //confirm the other value of sex as male
		Thread.sleep(3000);  //allows to pause for 3 seconds; slow
		driver.findElement(By.cssSelector("input[type='radio'][id='exp-3']")).click();   //use of multiple Css selector
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[7]/input")).sendKeys("Selenium is fun");//use of path locators 
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("Trying to like Selenium");//use of path locators 
	    driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("youareknown");//xpath for password
	
	}

}
