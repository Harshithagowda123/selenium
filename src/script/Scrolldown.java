package script;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrolldown {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver","./selenium_jason/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for(int i=0; i<3; i++)
		{
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		}
		for(int j=0; j<3; j++)
		{
			js.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(2000);
		}

}
}