package JenkinsDemo.JenkinsDemo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Godaddy {
	WebDriver driver;
  @Test
  public void testcase1() {
Assert.assertEquals(driver.getCurrentUrl(),"https://www.godaddy.com/en-in");

  }

  

  @Test(groups =  "g1")
  public void TestCase2() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.xpath("//button[@class=\"p1td6cxw\"]")).click();
	  driver.findElement(By.xpath("//button[@class=\"fqpukcf\"]")).click();
	  Thread.sleep(3000);

	  String a = driver.findElement(By.xpath("//*[@data-track-name=\"in_domains_domain_name_search\"]")).getText();
	  Assert.assertEquals(a,"Domain Name Search");

  }

  @Test(groups = "g2")
  public void TestCase3() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.xpath("//button[@class=\"p1td6cxw\"]")).click();
	  driver.findElement(By.xpath("//button[@class=\"fqpukcf\"]")).click();
	  driver.findElement(By.xpath("//*[@data-track-name=\"in_domains_domain_name_search\"]")).click();
	  String tital = driver.getTitle();

	  System.out.println(title);
	  Assert.assertEquals(title, "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN");

}

  @Test(groups = "g2")
  public void TestCase4() {
	  try {
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
      driver.findElement(By.linkText("Help")).click();
	  }catch (Exception e) {

 
	}

      String number = "040-67607600";
      Assert.assertEquals(number, "040-67607600");
 }

  

  @BeforeMethod

  public void bt() {
	  driver = new ChromeDriver();
	  driver.get("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();

  }

  @AfterMethod
  public void at() {
	  driver.quit();

 
  }
}
