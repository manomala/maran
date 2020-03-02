package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	@FindBy(xpath="//a[text() = 'Logout']")
	private WebElement Logout;

	public LogOut(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogout() {
		return Logout;
	}

}
