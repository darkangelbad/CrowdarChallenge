package Library;

import org.openqa.selenium.WebDriver;
import Library.FindElementBy;

public class Actions {

	public static void main(String[] args) {
	
	}

	public static void Click (WebDriver wd, String by, String path)
	{
		FindElementBy.SearchElementBy(wd, by, path).click();
	}
	
	public static void SendKeys (WebDriver wd, String by, String path, String Data)
	{
		FindElementBy.SearchElementBy(wd, by, path).sendKeys(Data);
	}
	
	public static void Clear (WebDriver wd, String by, String path)
	{
		FindElementBy.SearchElementBy(wd, by, path).clear();
	}
}
