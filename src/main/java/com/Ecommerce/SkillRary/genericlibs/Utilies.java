package com.Ecommerce.SkillRary.genericlibs;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
/**
 * 
 * @author QSP
 *
 */
public class Utilies {
	/**
	 * To handle dropdown
	 * @param ele
	 * @param text
	 */
	
	public static void dropdown(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	/**
	 * Handel mouse action
	 * @param driver
	 * @param ele
	 */
	public static void mouseHover(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
	}
	/**
	 * Handle double click
	 * @param driver
	 * @param ele
	 */
	public static void doubleClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	/**
	 * Handle the alert popup
	 * @param driver
	 */
	public static void alertPopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public static void switchingtabs(WebDriver driver) {
		Set<String> wb = driver.getWindowHandles();
		for(String b:wb) {
			driver.switchTo().window(b);
		}
	}
	
	

}
