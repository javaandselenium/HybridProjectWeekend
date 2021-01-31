package com.Ecommerce.SkillRary.genericlibs;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
/**
 * 
 * @author QSP
 *
 */

public class Photo implements AutoConstant{
	/**
	 * Take the photo failed testcase
	 * @param driver
	 * @param name
	 * @throws IOException
	 */
	
	public static void getphoto(WebDriver driver,String name) throws IOException {
		Date d=new Date();
		String date = d.toString().replaceAll(":","-");
		
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File(photopath+date+name+".png");
		FileUtils.copyFile(src, dest);
	}

}
