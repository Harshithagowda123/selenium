package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hidden {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver","./selenium_jason/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.cleartrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='Mon,Feb21'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='2'])[6]")).click();
		
	

}
}