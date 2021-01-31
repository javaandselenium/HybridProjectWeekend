package com.Ecommerce.SkillRary.genericlibs;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
/**
 * 
 * @author QSP
 *
 */

public class BaseClass implements AutoConstant {
	/**
	 * Open the application
	 */
	public WebDriver driver;
	@BeforeMethod
	public void openapp() throws FileNotFoundException, IOException {
		System.setProperty(key, value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Propertyfile.getPropertydata("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	/**
	 * takes the screenshot before close the application 
	 * @param r
	 * @throws IOException
	 */
	@AfterMethod
	public void closeapp(ITestResult r) throws IOException {
		int status = r.getStatus();
		String name = r.getName();
		if(status==2) {
			Photo.getphoto(driver, name);
		}
		driver.quit();
	}

}
