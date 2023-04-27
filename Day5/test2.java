package selenium_day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test2 {
	public static void main(String args[]) {
			WebDriverManager.chromedriver().setup();
			EdgeOptions co = new EdgeOptions();
			co.addArguments("--remote-allow-origins=*");
			EdgeDriver driver = new EdgeDriver(co);
			driver.get("https://jqueryui.com/droppable/");
			driver.manage().window().maximize();
			Actions builder = new Actions(driver);
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
			WebElement from = driver.findElement(By.id("draggable"));	 
			WebElement to = driver.findElement(By.id("droppable"));	 
			//Perform drag and drop
			builder.dragAndDrop(from, to).build().perform();
}
}