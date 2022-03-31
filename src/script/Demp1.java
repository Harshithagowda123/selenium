package script;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demp1 {
public static void main(String[] args) {
	System.setProperty("webdeiver.gecko.driver","./selenium_jason/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com");
}
}
