package JenkinsDemo.JenkinsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

@Listeners (JenkinsDemo.JenkinsDemo.Listner.class)
public class ListnersNewTest {
	WebDriver driver;
  @Test
  public void f1() {	  
	  driver.findElement(By.className("gLFyf")).sendKeys("Selenium",Keys.ENTER);
	  Assert.assertEquals(driver.getTitle(),"Selenium - Search");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  driver.navigate().back();
  }
 
  
  @BeforeClass
  public void f3() {
 	  driver=new ChromeDriver();
	  driver.get("https://google.com");
  }

}
