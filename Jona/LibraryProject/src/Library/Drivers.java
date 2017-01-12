package Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public static WebDriver driverChrome() {

		WebDriver wd = null;
		String exePath = "C:\\Users\\jacita\\shoppertrak\\project\\Jona\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		
		wd = new ChromeDriver();
		return wd;
	}

	public static WebDriver driverFirefox() {
		
		WebDriver wd = null;
		String exePath = "C:\\Users\\jacita\\shoppertrak\\project\\Jona\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exePath);
		
		wd = new FirefoxDriver();
		return wd;
	}
}
