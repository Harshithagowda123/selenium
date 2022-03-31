package script;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Insidedesable {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver","./selenium_jason/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///G:/jas.html");
		Thread.sleep(2000);
		JavascriptExecutor	js = (JavascriptExecutor)driver; 
		js.executeScript("document.getElementById('t1).value = 'abc'");
	}
}
