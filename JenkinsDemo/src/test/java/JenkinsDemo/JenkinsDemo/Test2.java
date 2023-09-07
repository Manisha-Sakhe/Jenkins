package JenkinsDemo.JenkinsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Test2 {
	WebDriver driver;
  @Test
  public void f() {
	  driver=new ChromeDriver();
	  driver.get("https://google.com");
	  
	  driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
	  Assert.assertEquals(driver.getTitle(),"selenium-Search");
  }
}
