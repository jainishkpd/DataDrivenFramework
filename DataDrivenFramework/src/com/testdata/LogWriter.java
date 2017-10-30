package com.testdata;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.apache.commons.io.FileUtils;

import com.setup.BrowserSetup;


public class LogWriter extends BrowserSetup {
	
    	public static Logger logger = Logger.getLogger("MyLog");  
    	static FileHandler fh;
    	
    	public void setLogger() throws SecurityException, IOException
    	{
    		// This block configure the logger with handler and formatter  
    		fh = new FileHandler("C:\\Users\\jainish.m.kapadia\\Pictures\\MyLog.txt");  
    		logger.addHandler(fh);
    		SimpleFormatter formatter = new SimpleFormatter();  
    		fh.setFormatter(formatter);  
        }

}