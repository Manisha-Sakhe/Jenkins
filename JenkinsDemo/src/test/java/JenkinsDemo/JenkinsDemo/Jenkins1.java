package JenkinsDemo.JenkinsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jenkins1 {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver=new ChromeDriver();
	  driver.get("https://google.com");
	  
	  
  }
}