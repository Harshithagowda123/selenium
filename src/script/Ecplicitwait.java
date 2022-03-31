package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecplicitwait {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver","./selenium_jason/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.findElement(By.id("usre name")).sendKeys("harshithagowda235@gmail.com");
		driver.findElement(By.id("pwda")).sendKeys("Harshu");
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains("facebook"));
		String title = driver.getTitle();
		System.out.println(title);
	}

}
