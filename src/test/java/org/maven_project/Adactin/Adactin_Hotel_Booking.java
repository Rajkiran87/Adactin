package org.maven_project.Adactin;

import java.io.IOException;

import org.Base_Class.BaseClass;

import com.pom.Customer_Details_pom;
import com.pom.Hotel_Booking_Pom;
import com.pom.Login_Pom;

public class Adactin_Hotel_Booking extends BaseClass {
	
	public static void main(String[] args) throws IOException, Throwable {
		
		browserLaunch("chrome");
		getURL("http://adactinhotelapp.com/");
		Login_Pom p = new Login_Pom(driver);
		Sendkeys(p.getUsername(), "Sachin10");
		Sendkeys(p.getPassword(), "53MEPC");
		click(p.getSubmit());
		
		Hotel_Booking_Pom p1 = new Hotel_Booking_Pom(driver);
		dropdown(p1.getLocation(), "Index", "8");
		dropdown(p1.getHotel(), "Index", "2");
		dropdown(p1.getRoomtype(), "value", "Deluxe");
		dropdown(p1.getNo_of_rooms(), "value", "3");
		clear(p1.getCheckin());
		Sendkeys(p1.getCheckin(), "29/03/2023");
		clear(p1.getCheckout());
		Sendkeys(p1.getCheckout(), "30/03/2023");
		dropdown(p1.getNo_of_Adults(), "VisibleText", "2 - Two");
		dropdown(p1.getNo_of_Child(), "value", "1");
		click(p1.getSubmit());
		
		click(p1.getList());
		click(p1.getFinish());
		
		Customer_Details_pom p2 = new Customer_Details_pom(driver);
		Sendkeys(p2.getFirstname(), "Sachin");
		Sendkeys(p2.getLastname(), "Tendulkar");
		Sendkeys(p2.getAddress(), "#8, Vivekanandar street, dubai main road, dubai cross road, dubai");
		Sendkeys(p2.getCardnumber(), "1234567891012134");
		dropdown(p2.getCardtype(), "index", "2");
		dropdown(p2.getExpirymonth(), "Index", "10");
		dropdown(p2.getExpiryyear(), "visibletext", "2022");
		Sendkeys(p2.getCvv(), "666");
		click(p2.getBooknow());
		
		Thread.sleep(5000);
		//javascript(p2.getScrolldown());	
		javascript_by_range("window.scrollBy(0,200)");
		TakescreenShot("Adactin.png");
		
		
	}
}
