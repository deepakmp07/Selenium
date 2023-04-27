package selenium_day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {
public static void main(String args[]) {
	WebDriverManager.chromedriver().setup();
	EdgeOptions co = new EdgeOptions();
	co.addArguments("--remote-allow-origins=*");
	EdgeDriver driver = new EdgeDriver(co);
	driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
	driver.findElement(By.id("input-firstname")).sendKeys("Deepak");
	driver.findElement(By.id("input-lastname")).sendKeys("M.P");
	driver.findElement(By.id("input-password")).sendKeys("Deepak");
	driver.findElement(By.id("input-email")).sendKeys("pdeepakpalanisamy@gmail.com");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,600)", "");
	driver.findElement(By.name("newsletter")).click();
    System.out.println("Radio Button Option 1 Selected");					

	}
}
