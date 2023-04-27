package selenium_day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test4 {
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		EdgeOptions co = new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		EdgeDriver driver = new EdgeDriver(co);
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[2]/td[1]/a")).click();
		driver.findElement(By.id("source")).click();
		driver.findElement(By.id("source")).sendKeys("Coimbatore");
		Thread.sleep(3000);
		driver.findElement(By.id("source")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("destination")).sendKeys("Tirunelveli");
		Thread.sleep(3000);
		driver.findElement(By.id("destination")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"seo_search_btn\"]")).click();
	}
	}
