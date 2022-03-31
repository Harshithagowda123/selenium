package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {
	public static void main(String[] args)  {
		System.setProperty("webdriver.gecko.driver","./selenium_jason/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///G:/d2.html");
		WebElement ele = driver.findElement(By.xpath("//input[@type = 'text']"));
		boolean b = ele.isDisplayed();
		if(b)
		{
			System.out.println("Element is displayed");
	}
	else
	{
		
		System.out.println("Element not displayed");
	}

	}
}
