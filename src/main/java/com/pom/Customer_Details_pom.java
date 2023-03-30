package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer_Details_pom {
	public static WebDriver driver;
	
	@FindBy(xpath="//*[@name='first_name']")
	private static WebElement firstname;
	
	@FindBy(xpath="//*[@name='last_name']")
	private static WebElement lastname;
	
	@FindBy(xpath="//*[@class='txtarea']")
	private static WebElement Address;
	
	@FindBy(xpath="(//*[@class='reg_input'])[3]")
	private static WebElement cardnumber;
	
	@FindBy(name="cc_type")
	private static WebElement Cardtype;
	
	@FindBy(xpath="(//select[@class='select_combobox2'])[1]")
	private static WebElement Expirymonth;
	
	@FindBy(name="cc_exp_year")
	private static WebElement Expiryyear;
	
	@FindBy(xpath="(//*[@class='reg_input'])[4]")
	private static WebElement cvv;
	
	@FindBy(id="book_now")
	private static WebElement Booknow;
	
	@FindBy(xpath="//*[@class='footer']")
	private static WebElement scrolldown;
	
	
	public Customer_Details_pom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	
	public static WebElement getFirstname() {
		return firstname;
	}

	public static WebElement getLastname() {
		return lastname;
	}

	public static WebElement getAddress() {
		return Address;
	}

	public static WebElement getCardnumber() {
		return cardnumber;
	}

	public static WebElement getCardtype() {
		return Cardtype;
	}

	public static WebElement getExpirymonth() {
		return Expirymonth;
	}

	public static WebElement getExpiryyear() {
		return Expiryyear;
	}

	public static WebElement getCvv() {
		return cvv;
	}

	public static WebElement getBooknow() {
		return Booknow;
	}

	public static WebElement getScrolldown() {
		return scrolldown;
	}
	
	
	
	

}
