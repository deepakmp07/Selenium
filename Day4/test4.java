package selenium_day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test4 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions con = new EdgeOptions();
		con.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver(con);
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'Mod104\']/div/div/div/div/div/div/a")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
			driver.close();			
		

	}

}