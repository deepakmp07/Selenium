package selenium_day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.JavascriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test5_2 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions com = new EdgeOptions();
		com.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver(com);
		driver.manage().window().maximize();
		driver.get("https://j2store.net/free/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,700)","");
		driver.findElement(By.xpath("//*[@id=\'Mod112\']/div/div/ul/li[1]/a/img")).click();
		List<WebElement> arr = driver.findElements(By.className("product-title"));
		for(WebElement i:arr)
			 System.out.println(i.getText());
		
	}

}