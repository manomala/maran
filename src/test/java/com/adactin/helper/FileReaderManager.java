package com.adactin.helper;

import java.io.IOException;

public class FileReaderManager {
	
	private FileReaderManager() {
		
	}
	
    public static FileReaderManager FileReadObject() {
    	FileReaderManager frm = new FileReaderManager();
    	return frm;

}
    
    public ConfigurationReader configurationReaderObject() throws IOException {
    	ConfigurationReader cr = new ConfigurationReader();
    	return cr;
    	
    			
    	

	}
}
