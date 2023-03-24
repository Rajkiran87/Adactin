package org.maven_project.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver browserLaunch(String browser) {
	if (browser.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
	else if(browser.equalsIgnoreCase("Firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		}
	return driver;
	}
	public static void EnterURL(String URL) {
		driver.get(URL);
	}
	public static void LoginID(WebElement user, String name) {
		user.sendKeys(name);
	}
	public static void Password(WebElement pass, String value) {
		pass.sendKeys(value);
	}
	public static void Login(WebElement button) {
		button.click();

	}
}
