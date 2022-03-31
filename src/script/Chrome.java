package script;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "./selenium_jason/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver = new ChromeDriver();
	}

}

