package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Booking_Pom {
	static WebDriver driver;
	
	@FindBy(name = "location")
	private static WebElement Location;
	
	@FindBy(name="hotels")
	private static WebElement hotel;
	
	@FindBy(id="room_type")
	private static WebElement roomtype;
	
	@FindBy(id="room_nos")
	private static WebElement No_of_rooms;
	
	@FindBy(id="datepick_in")
	private static WebElement Checkin;
	
	@FindBy(id="datepick_out")
	private static WebElement Checkout;
	
	@FindBy(xpath="(//*[@class='search_combobox'])[5]")
	private static WebElement No_of_Adults;
	
	@FindBy(name="child_room")
	private static WebElement No_of_Child;
	
	@FindBy(xpath="(//*[@class='reg_button'])[1]")
	private static WebElement submit;
	
	@FindBy(xpath="//*[@type='radio']")
	private static WebElement list;
	
	@FindBy(id="continue")
	private static WebElement finish;
	
	public Hotel_Booking_Pom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebElement getLocation() {
		return Location;
	}

	public static WebElement getHotel() {
		return hotel;
	}

	public static WebElement getRoomtype() {
		return roomtype;
	}

	public static WebElement getNo_of_rooms() {
		return No_of_rooms;
	}

	public static WebElement getCheckin() {
		return Checkin;
	}

	public static WebElement getCheckout() {
		return Checkout;
	}

	public static WebElement getNo_of_Adults() {
		return No_of_Adults;
	}

	public static WebElement getNo_of_Child() {
		return No_of_Child;
	}

	public static WebElement getSubmit() {
		return submit;
	}

	public static WebElement getList() {
		return list;
	}

	public static WebElement getFinish() {
		return finish;
	}

	
	

}
