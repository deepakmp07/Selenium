package selenium_day7;
import org.openqa.selenium.firefox.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_5 {
  WebDriver driver;
	@Test(groups = {"SmokeTest"})
  public void testcase1() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co = new ChromeOptions();
	  driver = new ChromeDriver(co);
	  driver.get("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();
	  String s1 = driver.getTitle();
	  Assert.assertEquals(s1,"Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN");
	  String url1 = driver.getCurrentUrl();
	  Assert.assertEquals(url1,"https://www.godaddy.com/en-in");
	  Thread.sleep(2000);
	  driver.close();
	 }
	
	@Test(groups = {"Regression TestCase"})
	public void testcase2() throws InterruptedException
	{
		 Thread.sleep(2000);
		  WebDriverManager.chromedriver().setup();
		  ChromeOptions co = new ChromeOptions();
		  driver = new ChromeDriver(co);
		  driver.get("https://www.godaddy.com/en-in");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
          Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
		  driver.close();
		
	}
	

	@Test(groups = {"e"})
	public void testcase3() throws InterruptedException
	{
		 Thread.sleep(2000);
		  WebDriverManager.chromedriver().setup();
		  ChromeOptions co = new ChromeOptions();
		  driver = new ChromeDriver(co);
		  driver.get("https://www.godaddy.com/en-in");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
          Thread.sleep(2000);
		  driver.findElement(By.linkText("Domain Name Search")).click();
		  Thread.sleep(2000);
		  
		  String s =driver.getTitle();
		  System.out.println(s);
		  Assert.assertEquals(s,"GoDaddy Domain Search - Buy and Register Available Domain Names"); 
		
	}
}