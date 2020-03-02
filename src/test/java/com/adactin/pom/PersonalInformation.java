package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInformation {
	
public PersonalInformation(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
		
	}

	@FindBy(id="first_name")
	private WebElement FirstName;
	
	
	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCreditCardNo() {
		return CreditCardNo;
	}

	public WebElement getCreditCardType() {
		return CreditCardType;
	}

	public WebElement getExpMonth() {
		return ExpMonth;
	}

	public WebElement getExpYear() {
		return ExpYear;
	}

	public WebElement getCVV() {
		return CVV;
	}

	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement Address;
	
	@FindBy(id="cc_num")
	private WebElement CreditCardNo;
	
	
	@FindBy(id="cc_type")
	private WebElement CreditCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement ExpMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ExpYear;
	
	@FindBy(id="cc_cvv")
	private WebElement CVV;
	
    @FindBy(id = "book_now")
    private WebElement Booking;
    @FindBy(xpath = "(//input[@type='button'])[2]")
    private WebElement itinerary;


	public WebElement getItinerary() {
		return itinerary;
	}

	public WebElement getBooking() {
		return Booking;
	}
}
