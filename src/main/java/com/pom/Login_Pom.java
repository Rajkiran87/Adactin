package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Pom {
	static WebDriver driver;
	
	@FindBy( xpath = "//*[@name='username']")
	private static WebElement username;
	
	@FindBy(xpath = "//*[@name='password']")
	private static WebElement password;
	
	@FindBy(xpath ="//*[@type='Submit']")
	private static WebElement submit;



	public Login_Pom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	public static WebElement getUsername() {
		return username;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getSubmit() {
		return submit;
	}
	
	
	}
	

