package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItineraryPage {
	
	
	public ItineraryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//table/tbody/tr[3]/td[1]")
	private WebElement OrderId1;
	
	
	public WebElement getOrderId1() {
		return OrderId1;
	}

	public WebElement getOrderId5() {
		return OrderId5;
	}

	public WebElement getOrderId15() {
		return OrderId15;
	}

	@FindBy(xpath = "//table/tbody/tr[6]/td[1]")
	private WebElement OrderId5;
	
	@FindBy(xpath = "//table/tbody/tr[15]/td[1]")
	private WebElement OrderId15;
	@FindBy(id = "search_hotel")
	private WebElement SearchHotel;

	public WebElement getSearchHotel() {
		return SearchHotel;
	}
	
	

}
