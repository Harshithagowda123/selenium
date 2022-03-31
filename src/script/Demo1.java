package script;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
	public static void main(String[] args) {
		String key = "webdriver.gecko.driver";
		String value = "./selenium_jason/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver = new FirefoxDriver();
	}

}
