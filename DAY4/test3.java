package selenium_day4;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test3 {
	public static void main(String sargs[]) {
	WebDriverManager.chromedriver().setup();
	EdgeOptions co = new EdgeOptions();
	co.addArguments("--remote-allow-origins=*");
	EdgeDriver driver = new EdgeDriver(co);
	driver.get("https://j2store.net/free/");
	
}
}