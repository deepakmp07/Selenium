package selenium_day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test2 {
public static void main(String args[]) {
	WebDriverManager.chromedriver().setup();
	EdgeOptions co = new EdgeOptions();
	co.addArguments("--remote-allow-origins=*");
	EdgeDriver driver = new EdgeDriver(co);
	driver.manage().window().maximize();
	driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
	driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Deepak");
	driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("727721eucs022@skcet.ac.in");
	driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("Deepak");
	driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("727721eucs022@skcet.ac.in");
	driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]")).click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,600)", "");
	driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("Happy Birthday");
	driver.findElement(By.xpath("//*[@id=\"input-amount\"]")).sendKeys("10000");
	driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
	driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();



}
}
