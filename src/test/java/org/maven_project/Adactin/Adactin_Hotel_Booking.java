package org.maven_project.Adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Adactin_Hotel_Booking extends BaseClass {
	
	public static void main(String[] args) {
		browserLaunch("Chrome");
		EnterURL("http://adactinhotelapp.com/");
		
		WebElement username = driver.findElement(By.xpath("//*[@name='username']"));
		LoginID(username, "Sachin10");
		
		WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
		Password(password, "53MEPC");
		
		WebElement submit = driver.findElement(By.xpath("//*[@type='Submit']"));
		Login(submit);
		
	}

}
