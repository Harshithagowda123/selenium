package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fileupload {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver","./selenium_jason/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///G:/upload.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.name("upload file"));
		ele.sendKeys("https://skpatro.github.io/demo/links/");

}
}