package T1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstOne {
	
	public void main(String[] args) throws InterruptedException
	{
		WebDriver wd;
		wd = new ChromeDriver();
		wd.get("https://www.guru99.com/first-webdriver-script.html");
		Thread.sleep(1000);
	}

}
