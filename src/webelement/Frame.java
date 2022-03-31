package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver","./selenium_jason/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///G:/page.html");
		Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@id='a1']")).sendKeys("abc");
		Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//iframe[@id='f1']"));
	driver.switchTo().frame(ele);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='a2']")).sendKeys("xyz");
		
		
	}
}
