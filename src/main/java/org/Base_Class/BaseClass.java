package org.Base_Class;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	
	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("start-maximized");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(opt);
		} else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static void getURL(String URL) {
		driver.get(URL);
	}

	public static void Sendkeys(WebElement user, String name) {
		user.sendKeys(name);
	}
	
	public static void click(WebElement button) {
		button.click();
	}
	
	public static void clear(WebElement clear) {
		clear.clear();
	}

	public static void Alert(String type) {
		if (type.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		} else if (type.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		} else if (type.equalsIgnoreCase("getText")) {
			String text = driver.switchTo().alert().getText();
			System.out.println(text);
		}
	}

	public static void Sendkeys_Alert(String value) {
		driver.switchTo().alert().sendKeys(value);
		driver.switchTo().alert().accept();
	}

	public static void TakescreenShot(String filename) throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File f = ss.getScreenshotAs(OutputType.FILE);
		File f1 = new File("C:\\Users\\Karthik\\eclipse-workspace\\Adactin\\ScreenShot\\" + filename + "");
		FileHandler.copy(f, f1);
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}
	public static void navigateBack(String navigation) {
		if(navigation.equalsIgnoreCase("back")) {
			driver.navigate().back();
		}else if(navigation.equalsIgnoreCase("forword")) {
			driver.navigate().forward();
		}else if(navigation.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		}
	}
	
	public static void close() {
		driver.close();
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void actions(String type, WebElement element) {
		 Actions ac = new Actions(driver);
		if(type.equalsIgnoreCase("click")) {
		ac.click(element).build().perform();
		}else if (type.equalsIgnoreCase("contextclick")) {
		ac.contextClick(element).build().perform();
		}else if (type.equalsIgnoreCase("doubleclick")) {
		ac.doubleClick(element).build().perform();
		}else if (type.equalsIgnoreCase("moveToElement")) {
		ac.moveToElement(element).build().perform();
		}
	}
	public static void moveToElement_Offset(WebElement target, int x, int y) {
		 Actions ac = new Actions(driver);
		ac.clickAndHold(target);
		ac.moveToElement(target, x, y);
		
	}
	public static void dragAndDrop(WebElement target, WebElement source) {
		 Actions ac = new Actions(driver);
		ac.clickAndHold(target).build().perform();
		ac.dragAndDrop(target, source).build().perform();
	}
	
	public static void dropdown(WebElement drop, String type, String value) {
		Select s = new Select(drop);
		if(type.equalsIgnoreCase("Index")) {
			int int1 = Integer.parseInt(value);
			s.selectByIndex(int1);
		}else if(type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}else if(type.equalsIgnoreCase("VisibleText")) {
			s.selectByVisibleText(value);
		}else if(type.equalsIgnoreCase("de-Index")) {
			int parseInt = Integer.parseInt(value);
			s.deselectByIndex(parseInt);
		}else if(type.equalsIgnoreCase("de-Value")) {
			s.deselectByValue(value);
		}else if(type.equalsIgnoreCase("de-VisibleText")) {
			s.deselectByVisibleText(value);
		}else if(type.equalsIgnoreCase("Deselect-All")) {
			s.deselectAll();
		}
	}
	
	public static void javascriptby_Element(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", e);	
	}
	
	public static void javascript_by_range(String range) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(range);
		
	}
	
	
	
	
}
