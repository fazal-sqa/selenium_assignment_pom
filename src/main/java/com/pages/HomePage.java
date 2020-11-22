package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.base.BaseClass;

public class HomePage extends BaseClass {

	// Defining the Object Repository

	@FindBy(linkText = "Chapter1")
	WebElement linkChapter1;

	@FindBy(linkText = "Chapter2")
	WebElement linkChapter2;

	@FindBy(linkText = "Chapter3")
	WebElement linkChapter3;

	@FindBy(linkText = "Chapter4")
	WebElement linkChapter4;

	@FindBy(linkText = "Chapter8")
	WebElement linkChapter8;

	public HomePage() {

		// This initElements method will trigger/initiate all WebElements within this
		// page
		PageFactory.initElements(driver, this);
	}

	public void clickLinkChapter1() {
		try {
			linkChapter1.click();
		} catch (ElementNotInteractableException e) {
			e.printStackTrace();
		} catch (ElementNotSelectableException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public void clickLinkChapter2() {
		try {
			linkChapter2.click();
		} catch (ElementNotInteractableException e) {
			e.printStackTrace();
		} catch (ElementNotSelectableException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}

	public void clickLinkChapter3() {
		try {
			linkChapter3.click();
		}

		catch (ElementNotInteractableException e) {
			e.printStackTrace();
		} catch (ElementNotSelectableException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}

	public void clickLinkChapter4() {
		try {
			linkChapter4.click();
		} catch (ElementNotInteractableException e) {
			e.printStackTrace();
		} catch (ElementNotSelectableException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}

	public void clickLinkChapter8() {
		try {

			linkChapter8.click();
		} catch (ElementNotInteractableException e) {
			e.printStackTrace();
		} catch (ElementNotSelectableException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}

	public void verifyTitle() {

		try {
			WebDriverWait wait = new WebDriverWait((WebDriver) TimeUnit.SECONDS, 10);
			wait.until(ExpectedConditions.titleContains(driver.getTitle()));

		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}

}

//WebDriverWait wait = new WebDriverWait((WebDriver) TimeUnit.SECONDS, 10);
//wait.until(ExpectedConditions.elementToBeClickable(linkChapter8));