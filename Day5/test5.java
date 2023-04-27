package selenium_day5;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test5 {
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co1 = new ChromeOptions();
		co1.addArguments("--remote-allow-origins=*");
		ChromeDriver driver1 = new ChromeDriver(co1);
		driver1.get("https://www.google.com");
		driver1.manage().window().maximize();
		driver1.findElement(By.name("q")).sendKeys("apple");
		driver1.findElement(By.name("q")).sendKeys(Keys.ENTER);
        System.out.print(driver1.getWindowHandle()+" ");	
        System.out.print(driver1.getTitle());	
        System.out.println();
        driver1.switchTo().newWindow(WindowType.TAB);
		driver1.get("https://www.google.com");
		driver1.manage().window().maximize();
		driver1.findElement(By.name("q")).sendKeys("selenium");
		driver1.findElement(By.name("q")).sendKeys(Keys.ENTER);
        System.out.print(driver1.getWindowHandle()+" ");	
        System.out.print(driver1.getTitle());
        System.out.println();

        driver1.switchTo().newWindow(WindowType.TAB);
		driver1.get("https://www.google.com");
		driver1.manage().window().maximize();
		driver1.findElement(By.name("q")).sendKeys("cucumber");
		driver1.findElement(By.name("q")).sendKeys(Keys.ENTER);
        System.out.print(driver1.getWindowHandle()+" ");	
        System.out.print(driver1.getTitle());
        System.out.println();
        Set<String> al = driver1.getWindowHandles();
        System.out.println("Number Of Windows opened = "+al.size());
}
}
