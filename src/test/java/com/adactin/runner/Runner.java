package com.adactin.runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.WebTestBase;
import com.adactin.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", glue = "com\\adactin\\stepdefinition", strict = true, dryRun= false, plugin = "html:Report", monochrome= true)

public class Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void browserlaunch() throws IOException {
		String browserLaunch = FileReaderManager.FileReadObject().configurationReaderObject().browserLaunch();

		driver = WebTestBase.browserOpen(browserLaunch);
		
		
		

	}
	

}
