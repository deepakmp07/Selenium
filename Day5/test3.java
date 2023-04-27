package selenium_day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class test3 {
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		EdgeOptions co = new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		EdgeDriver driver = new EdgeDriver(co);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement txt = driver.findElement(By.name("cusid"));
		txt.sendKeys("401");
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		txt.clear();
		txt.sendKeys("402");
		submit.click();
		alert1.accept();
		String str = alert1.getText();
		alert1.accept();
		System.out.print(str);
//		Actions builder = new Actions(driver);
//		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
//		WebElement from = driver.findElement(By.id("draggable"));	 
//		WebElement to = driver.findElement(By.id("droppable"));	 
//		//Perform drag and drop
//		builder.dragAndDrop(from, to).build().perform();
	}
}
