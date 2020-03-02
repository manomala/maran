package com.adactin.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.WebTestBase;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.ProjectObjectManager;
import com.adactin.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Stepdefinition extends WebTestBase {
	public static WebDriver driver = Runner.driver;
	ProjectObjectManager pom = new ProjectObjectManager(driver);

	@Given("User launch the adactin appliction")
	public void user_launch_the_adactin_appliction() throws IOException {
		String appLaunch = FileReaderManager.FileReadObject().configurationReaderObject().appLaunch();
		applaunch(appLaunch);

	}

	@When("User enter the Username {string} in Username")
	public void user_enter_the_Username_in_Username(String string) {
		inputValueElement(pom.getLogIn().getUsername(), string);

	}

	@When("User enter the password {string} in Password")
	public void user_enter_the_password_in_Password(String string) {
		inputValueElement(pom.getLogIn().getPassword(), string);
	}

	@When("User click the login button")
	public void user_click_the_login_button() {

		radiobutton(pom.getLogIn().getLogin());
	}

	@When("User Selecting a Location")
	public void user_Selecting_a_Location() {

		dropDown(pom.gethotelbooking().getLocation(), "byValue", "Brisbane");

	}

	@When("User selecting a Hotel")
	public void user_selecting_a_Hotel() {

		dropDown(pom.gethotelbooking().getHotel(), "byValue", "Hotel Hervey");

	}

	@When("User Selecting a Room")
	public void user_Selecting_a_Room() {
		dropDown(pom.gethotelbooking().getRoomType(), "byValue", "Super Deluxe");

	}

	@When("User Enter a Room Number")
	public void user_Enter_a_Room_Number() {
		dropDown(pom.gethotelbooking().getNumberRoom(), "byValue", "3");

	}

	@When("User Selecting a Date")
	public void user_Selecting_a_Date() {
		inputValueElement(pom.gethotelbooking().getInDate(), "27/02/2020");
		inputValueElement(pom.gethotelbooking().getOutDate(), "29/02/2020");
	}

	@When("User Selecting a Adult Room")
	public void user_Selecting_a_Adult_Room() {
		dropDown(pom.gethotelbooking().getAdultRoom(), "byValue", "3");
	}

	@When("User Choose a Child Room")
	public void user_Choose_a_Child_Room() {
		dropDown(pom.gethotelbooking().getChildRoom(), "byValue", "4");
	}

	@When("User Click the Submit Button")
	public void user_Click_the_Submit_Button() {
		radiobutton(pom.gethotelbooking().getSearch());

	}

	@When("User Enter Particular Hotel")
	public void user_Enter_Particular_Hotel() {

		radiobutton(pom.gethotelSelection().getHotelSelection());

	}

	@When("User Confirm a Hotel")
	public void user_Confirm_a_Hotel() {
		radiobutton(pom.gethotelSelection().getContinue());

	}

	@When("User Enter Firstname")
	public void user_Enter_Firstname() {
		inputValueElement(pom.getPersonalInformation().getFirstName(), "mano");

	}

	@When("User Enter LastName")
	public void user_Enter_LastName() {
		inputValueElement(pom.getPersonalInformation().getLastName(), "mala");
	}

	@When("User Enter billing Address")
	public void user_Enter_billing_Address() {
		inputValueElement(pom.getPersonalInformation().getAddress(), "166,lakeview road, chennai");

	}

	@When("User Enter CreditCard Number")
	public void user_Enter_CreditCard_Number() {
		inputValueElement(pom.getPersonalInformation().getCreditCardNo(), "1234567890123456");
	}

	@When("User Enter CreditCard Type")
	public void user_Enter_CreditCard_Type() {

		dropDown(pom.getPersonalInformation().getCreditCardType(), "byValue", "VISA");
	}

	@When("User Enter Expired Month")
	public void user_Enter_Expired_Month() {

		dropDown(pom.getPersonalInformation().getExpMonth(), "byValue", "4");

	}

	@When("User Enter Expired Year")
	public void user_Enter_Expired_Year() {

		dropDown(pom.getPersonalInformation().getExpYear(), "byValue", "2020");

	}

	@When("User Enter CVV Number")
	public void user_Enter_CVV_Number() {
		inputValueElement(pom.getPersonalInformation().getCVV(), "143");

	}

	@When("User click the Booknow button")
	public void user_click_the_Booknow_button() {

		radiobutton(pom.getPersonalInformation().getBooking());

	}

	@When("User click the Itinerary button")
	public void user_click_the_Itinerary_button() {
		radiobutton(pom.getPersonalInformation().getItinerary());

	}

	@When("User click the OrderId1")
	public void user_click_the_OrderId1() {

		radiobutton(pom.getItineraryPage().getOrderId1());
	}

	@When("User click the OrderId5")
	public void user_click_the_OrderId5() {
		radiobutton(pom.getItineraryPage().getOrderId5());

	}

	@When("User click the OrderId15")
	public void user_click_the_OrderId15() {
		radiobutton(pom.getItineraryPage().getOrderId15());

	}

	@When("User Search Hotel")
	public void user_Search_Hotel() {
		radiobutton(pom.getItineraryPage().getSearchHotel());

	}

	@When("User Logout the Page")
	public void user_Logout_the_Page() {
		radiobutton(pom.getLogOut().getLogout());

	}

}
