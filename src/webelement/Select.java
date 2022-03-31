package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Select {
	public Select(WebElement ele) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver","./selenium_jason/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/reg/?rs=7l");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("year"));
		Select s= new Select(ele);
		List<WebElement> option = s.getOptions();
		int count = option.size();
		System.out.println(count);	 
}
}