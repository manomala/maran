package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelBooking {
	
		
public HotelBooking(WebDriver driver) {

	
	PageFactory.initElements(driver, this);
		
	}


	@FindBy(id= "location")
	private WebElement Location;
	
	public WebElement getLocation() {
		return Location;
	}
	public WebElement getHotel() {
		return Hotel;
	}
	public WebElement getRoomType() {
		return RoomType;
	}
	public WebElement getNumberRoom() {
		return NumberRoom;
	}
	public WebElement getInDate() {
		return InDate;
	}
	public WebElement getOutDate() {
		return OutDate;
	}
	public WebElement getAdultRoom() {
		return AdultRoom;
	}
	public WebElement getChildRoom() {
		return ChildRoom;
	}
	@FindBy(id= "hotels")
	private WebElement Hotel;
	@FindBy(id= "room_type")
	private WebElement RoomType;
	@FindBy(id="room_nos")
	private WebElement NumberRoom;
	@FindBy(id="datepick_in")
	private WebElement InDate;
	@FindBy(id="datepick_out")
	private WebElement OutDate;
	@FindBy(id="adult_room")
	private WebElement AdultRoom;
	@FindBy(id="child_room")
	private WebElement ChildRoom;
	
	@FindBy(id="Submit")
	private WebElement Search;

	public WebElement getSearch() {
		return Search;
	}
	
	

	
}
