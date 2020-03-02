package com.adactin.stepdefinition;

import java.io.IOException;

import com.adactin.baseclass.WebTestBase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends WebTestBase {
	@Before
	public void beforeHooks(Scenario scenario) {
		System.out.println(scenario.getName());

	}
	@After
	public void afterHooks(Scenario scenario) throws IOException {
		System.out.println(scenario.getStatus());
		if (scenario.isFailed()) {
			screenShot("./Screenshot/"+scenario.getName()+".png");
			
		}
		
		

	}

}
