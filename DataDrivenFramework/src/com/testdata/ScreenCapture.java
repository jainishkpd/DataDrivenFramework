package com.testdata;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.setup.BrowserSetup;

public class ScreenCapture extends BrowserSetup {
	
	public static void passScreenCapture() throws IOException
	{
		Date d = new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile,  new File("D:\\Test\\MedicatHRMS\\test-output\\MedicatHRMS\\ScreenCapture"+sdf.format(d)+".png"));
	}
	
	public static void failScreenCapture() throws IOException
	{
		Date d = new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile,  new File("D:\\Test\\MedicatHRMS\\test-output\\MedicatHRMS\\ScreenCapture"+sdf.format(d)+".png"));
	}

}
