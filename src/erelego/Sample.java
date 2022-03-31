package erelego;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import script.Chrome;

public class Sample {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./selenium_jason/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://35.154.17.76/srsudupi.com/");
		driver.findElement(By.xpath("//input[@id='uname']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin@school");
	    driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div/form/div/div[3]/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/ul/li[6]/a/p")).click();
    
    

}
}