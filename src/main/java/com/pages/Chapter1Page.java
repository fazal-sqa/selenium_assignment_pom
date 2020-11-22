package com.pages;

import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.base.BaseClass;

public class Chapter1Page extends BaseClass {

	@FindBy(id = "divontheleft")
	WebElement textToAssert;

	@FindBy(id = "radiobutton")
	WebElement radioButton;

	@FindBy(name = "selected(1234)")
	WebElement checkBox;

	@FindBy(linkText = "Home Page")
	WebElement linkHomePage;

	public Chapter1Page() {

		PageFactory.initElements(driver, this);
	}

	public String verifyText() {

		String text = textToAssert.getText();
		return text;

	}


	public void clickHomeLink( ) {
	
		try {
			linkHomePage.click();
		} catch (ElementNotInteractableException e) {
			e.printStackTrace();
		} catch (ElementNotSelectableException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		}
	}

