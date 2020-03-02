package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.HotelBooking;
import com.adactin.pom.HotelSelection;
import com.adactin.pom.ItineraryPage;
import com.adactin.pom.LogOut;
import com.adactin.pom.LoginPage;
import com.adactin.pom.PersonalInformation;

public class ProjectObjectManager {
	
	private WebDriver driver;



	public ProjectObjectManager(WebDriver mdriver) {
		this.driver=mdriver;
		
	}
	
	
	
	public  LoginPage getLogIn() {
		LoginPage lp = new LoginPage(driver);
		return lp;

	}
	
	
	
	public  ItineraryPage getItineraryPage() {
		ItineraryPage ip = new ItineraryPage(driver);
		return ip;

	}
	
	public HotelSelection gethotelSelection() {
		HotelSelection hs = new HotelSelection(driver);
		return hs;

	}
	
	public HotelBooking gethotelbooking() {
		HotelBooking hp = new HotelBooking(driver);
		return hp;

	}
	
	
	public PersonalInformation getPersonalInformation() {
		PersonalInformation pi = new PersonalInformation(driver);
		return pi;
	}
	 public LogOut getLogOut() {
		 LogOut lo = new LogOut(driver);
		 return lo;

	}

}
