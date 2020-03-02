package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSelection {
public HotelSelection(WebDriver driver) {
	PageFactory.initElements(driver, this);
		
	}

	@FindBy(id ="radiobutton_0")
	private WebElement HotelSelection;
	
	public WebElement getHotelSelection() {
		return HotelSelection;
	}
	public WebElement getContinue() {
		return Continue;
	}
	@FindBy(id = "continue")
	private WebElement Continue;
}
