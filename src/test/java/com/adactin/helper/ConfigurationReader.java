package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties ps;
	
	public ConfigurationReader() throws IOException {
		File f = new File("./src/test/java/com/adactin/properties/Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		 ps= new Properties();
		ps.load(fis);
	}

	
	public String browserLaunch() {
		String browsername = ps.getProperty("browsername");
		return browsername;
		

	}
	public String appLaunch() {
		String appLaunch = ps.getProperty("url");
		return appLaunch;
	}
		
}
