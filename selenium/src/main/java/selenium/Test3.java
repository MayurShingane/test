package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.findElement(By.name("webform")).click();	
		driver.findElement(By.xpath("//*[@id=\"vfb-6-1\"]")).click();
		driver.findElement(By.id("vfb-6-0")).click();

	}

}
