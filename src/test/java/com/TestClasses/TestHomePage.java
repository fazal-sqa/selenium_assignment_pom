package com.TestClasses;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.filechooser.FileSystemView;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.Chapter1Page;
import com.pages.HomePage;

public class TestHomePage extends BaseClass {

	HomePage ObjSeleniumBegginnerGuide;
	Chapter1Page ObjChapter1;

	@BeforeMethod
	@Parameters("browser")

	public void setUp(String browser) throws InterruptedException {

		initialization(browser);

		ObjSeleniumBegginnerGuide = new HomePage();
		ObjChapter1 = new Chapter1Page();
	}


	@Test()
	public void TestNavigateToChapter1Page() throws InterruptedException, IOException {

		ObjSeleniumBegginnerGuide.clickLinkChapter1();
		
		String actualText = ObjChapter1.verifyText();

		String expectedText = "Assert that this text is on the page";

		Assert.assertEquals(actualText, expectedText, "Text is not correct as required!");
		
		
		ObjChapter1.clickHomeLink();
	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
