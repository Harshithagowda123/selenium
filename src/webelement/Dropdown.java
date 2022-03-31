package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver","./selenium_jason/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///G:/a1.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("Shivaji military hotel"));
		Select s = new Select(ele);
		s.selectByIndex("i");
		Thread.sleep(2000);
		s.selectByValue("k");
		Thread.sleep(2000);
		s.selectByVisibleText("keema");
		Thread.sleep(2000);
		s.deSelect()
}
}