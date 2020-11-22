package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseClass {

	public static WebDriver driver;

	public static void initialization(String browserName) throws InterruptedException {

		// Chrome -- WebDriver Configurations
		if (browserName.equalsIgnoreCase("chrome"))

		{

			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		// FireFox -- WebDriver Configurations.

		else if (browserName.equalsIgnoreCase("firefox"))

		{

			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		// Microsoft Edge -- WebDriver Configurations
		
		else if (browserName.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

			driver.manage().window().maximize();
		}
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "http://book.theautomatedtester.co.uk";
		driver.navigate().to(url);
		
	}
}
