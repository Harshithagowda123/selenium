package erelego;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcases {
	@Test 
	public void ValidLogin() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\workspace\\selenium\\selenium_jason\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://35.154.17.76/ams.vanivilasschool.com/");
		driver.findElement(By.id("uname")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@english");
		driver.findElement(By.xpath("//*[@id='LoginValidation']/div/div[3]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div[1]/div/div[3]/div/a")).click();
		Thread.sleep(2000);
		
		Actions at = new Actions(driver);
		at.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
			      
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/ul/li[3]/a/p")).click();
		Thread.sleep(2000);
			      
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div[3]/div/div[3]/a[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Arun");
		driver.findElement(By.name("reg_no")).sendKeys("456");
		driver.findElement(By.id("dateofbirth")).sendKeys("");
		driver.findElement(By.xpath("//*[@id='id_form']/div[3]/div[5]/div[1]/input[1]")).click();
		
		driver.findElement(By.name("fathername")).sendKeys("mohan");
		driver.findElement(By.name("fatherphone")).sendKeys("9632587415");
		driver.findElement(By.name("mothername")).sendKeys("shuba");
		driver.findElement(By.xpath("//*[@id='id_form']/div[3]/div[5]/div[1]/input[1]")).click();
	 
		
	}
	
	

}////*[@id="id_form"]/div[3]/div[5]/div[1]/input[1]
