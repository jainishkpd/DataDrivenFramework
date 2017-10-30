package com.medicathrms;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testdata.LogWriter;
import com.testdata.ScreenCapture;
import com.testdata.TestData;
import com.setup.BrowserSetup;

public class Dashboard extends BrowserSetup {
	
	@Test
	public void dashboard() throws IOException
	{
		new LogWriter().setLogger();
		
		String page_title = driver.getTitle();
		System.out.println(page_title);
		LogWriter.logger.info(page_title);
		
		String expected_page_url = driver.getCurrentUrl();
		System.out.println(expected_page_url);
		LogWriter.logger.info(expected_page_url);
		
		Assert.assertEquals(expected_page_url, TestData.dashboard_actual_page_url);
		
		System.out.println("Dashboard Page.");
		LogWriter.logger.info("Dashboard Page.");
		
		ScreenCapture.passScreenCapture();
	}

}
