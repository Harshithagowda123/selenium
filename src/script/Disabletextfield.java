package script;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabletextfield {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./selenium_jason/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///G:/jas.html");
		Thread.sleep(2000);
		JavascriptExecutor	js = (JavascriptExecutor)driver; 
		js.executeScript("document.getElementById('t1).value");
	}

}
