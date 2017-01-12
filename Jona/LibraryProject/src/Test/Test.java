package Test;

import org.openqa.selenium.WebDriver;

import Library.Drivers;
import Library.Actions;

public class Test {

	public static void main(String[] args) {
		
		String URL = ("http://www.google.com");
		WebDriver wd = Drivers.driverChrome();
		//WebDriver wd = Drivers.driverFirefox();
		
		
		wd.get(URL);
		Actions.SendKeys(wd, "id", "lst-ib", "Gatos");
		sleep (10000);
		Actions.Click(wd, "id", "_fZl");
		sleep (5000);
		Actions.Click(wd, "xpath", "//a[contains(text(),'Los Mejores Vines de Gatos del 2015! Recopilación Gatos Graciosos ...')]");
		sleep (5000);
		wd.navigate().back();
		sleep (5000);
		Actions.Clear(wd, "id", "lst-ib");
		sleep (5000);
		Actions.SendKeys(wd, "id", "lst-ib", "Selenium");
		sleep (10000);
		Actions.Click(wd, "id", "_fZl");
		sleep (5000);
		Actions.Click(wd, "xpath", "//a[contains(text(),'Selenium - Web Browser Automation')]");
		
		
	}
	
private static void sleep(int i) {
		
		try {
			Thread.sleep(i);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}		
	}

}
