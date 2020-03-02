package com.adactin.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTestBase {

	public static WebDriver driver;

	public static WebDriver browserOpen(String browser) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./browserDriver/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}

			else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./src/browserDriver/chromedriver.exe");
				// driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
			}

			else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.ie.driver", "./src/browserDriver/chromedriver.exe");
				// driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				
			}

			else {
				System.out.println("Invalid");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;

	}

	public static void applaunch(String url) {

		driver.get(url);
	}

	public static void browserClose() {

		driver.quit();

	}

	public static void radiobutton(WebElement element) {
		element.click();
	}

	public static void getcurrenturl() {
		System.out.println(driver.getCurrentUrl());

	}

	public static void getTitle() {
		driver.getTitle();
	}

	public static void navigateto(String url) {
		driver.navigate().to(url);
	}

	public static void back() {
		driver.navigate().back();
	}

	public static void forward() {
		driver.navigate().forward();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void Quit() {
		driver.quit();
	}

	public static void getAttripute(WebElement element, String value) {
		element.getAttribute(value);

	}

	public static void screenShot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File stsFile = ts.getScreenshotAs(OutputType.FILE);
		File dstFile = new File(path);
		FileHandler.copy(stsFile, dstFile);
	}

	public static void openalert(String openalert) {
		if (openalert.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
		}

		else {
			System.out.println("Invalid arguement");
		}
	}

	public static void confirmationAlert(String confirmationalert, String text) {
		if (confirmationalert.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().sendKeys(text);
			driver.switchTo().alert().accept();
		} else if (confirmationalert.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().sendKeys(text);
			driver.switchTo().alert().dismiss();
		} else {
			System.out.println("Invalid arguement");
		}
	}

	public static void Actions(String perform, WebElement target) {
		try {
			Actions act = new Actions(driver);
			if (perform.equalsIgnoreCase("movetoelement")) {
				act.moveToElement(target).build().perform();
			} else if (perform.equalsIgnoreCase("doubleclick")) {
				act.doubleClick(target).build().perform();

			} else if (perform.equalsIgnoreCase("clickandhold")) {
				act.clickAndHold(target).build().perform();

			} else if (perform.equalsIgnoreCase("contextclick")) {
				act.contextClick().build().perform();

			} else {
				System.out.println("Invalid Actions");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void DragandDrop(WebElement source, WebElement target) {
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();

	}

	public static void robot() throws AWTException {
		Robot key = new Robot();
		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);

		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_DOWN);

	}
	 public static void inputValueElement(WebElement element, String value) {
		    
    	 element.sendKeys(value);
     }
	 public static void dropDown(WebElement element, String options, String value) {
			Select sc = new Select(element);
			try {
				if (options=="byIndex") {
				    int parseInt = Integer.parseInt(value);
				    sc.selectByIndex(parseInt);	
				}
				else if (options=="byValue") {
					sc.selectByValue(value);
					}
				else if (options=="byVisibleText") {
					sc.selectByVisibleText(value);
					
				}
				else {
					System.out.println("Invalid option");
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}

	public static void scrollUpandDown(String arguments, Object element) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript(arguments, element);
	}

	/*public static void Waitstatement(String implitcityWait, long seconds, TimeUnit time, long timeOutInSeconds,
			String explitcityWait, WebElement element, String fluentwait ) {
		if (implitcityWait.equalsIgnoreCase("wait")) {
			driver.manage().timeouts().implicitlyWait(seconds, time);
		}

		if (explitcityWait.equalsIgnoreCase("wait")) {
			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
			wait.until(ExpectedConditions.visibilityOf(element));

		}*/
		
	
}
