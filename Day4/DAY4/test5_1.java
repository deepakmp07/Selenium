package selenium_day4;

import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class test5_1 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions con = new EdgeOptions();
		con.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver(con);
		driver.manage().window().maximize();
		driver.get("https://j2store.net/free/");
		String x = driver.getCurrentUrl();
		if(x.equals("https://j2store.net/free/"))
            System.out.println("Links are equal1");
		else
			System.out.println("Links are not equal1");
         driver.findElement(By.xpath("//*[@id=\'Mod104\']/div/div/div/div/div/div/a")).click();
         String y = driver.getCurrentUrl();
         if(y.equals("https://j2store.net/free/index.php/shop"))
             System.out.println("Links are equal2");
 		else
 			System.out.println("Links are not equal2");
        	  

	}

}