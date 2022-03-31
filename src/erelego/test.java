package erelego;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class test {
	WebDriver driver;
	
	  @SuppressWarnings("unlikely-arg-type")
	@Test()
	  public void verifyinstitutename() throws Exception{
		  String expectedName = "Institution_name";
		  WebElement actualName = driver.findElement(By.linkText("http://35.154.17.76/ams.vanivilasschool.com/"));
		  
		  
		  if (expectedName.equals(actualName)) {
			  System.out.println("right" + expectedName);
		  }
		  else {
			  System.out.println("wrong" + actualName);
		  }
	  }
	  
	  @Test
	  public void verifyHomepageTitleTest() throws Exception{
	       
	      String expectedTitle = "title";	
	      String actualTitle = driver.getTitle();
	      if (actualTitle==expectedTitle) {
	    	  System.out.println("right:----" + expectedTitle);
	      }
	      else {
	    	  System.out.println("wrong:---"+actualTitle);
	      }
	  } 
	
	

}
