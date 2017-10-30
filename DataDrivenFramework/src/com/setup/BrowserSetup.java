package com.setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserSetup {
	
	public static WebDriver driver;
	
	public void setup(String browser)
	{
		switch(browser)
		{
			case "chrome" :
				System.setProperty("webdriver.chrome.driver", "D:\\Jainish\\RND\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				break;
				
			case "firefox" :
				System.setProperty("webdriver.gecko.driver", "D:\\Jainish\\RND\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				break;
				
			case "ie" :
				System.setProperty("webdriver.ie.driver", "D:\\Jainish\\RND\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				break;
				
			case "opera" :
				System.setProperty("webdriver.opera.driver", "D:\\Jainish\\RND\\Drivers\\operadriver.exe");
				driver = new OperaDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				break;
				
			default :
				System.setProperty("webdriver.chrome.driver", "D:\\Jainish\\RND\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				break;			
		}
	}

}
