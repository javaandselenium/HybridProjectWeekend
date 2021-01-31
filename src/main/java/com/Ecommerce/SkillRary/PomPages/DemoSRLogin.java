package com.Ecommerce.SkillRary.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSRLogin {
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	@FindBy(id="course")
	private WebElement coursebtn;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	public WebElement getCoursebtn() {
		return coursebtn;
	}

	public DemoSRLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getCoursedd() {
		return coursedd;
	}
	
	public void seleniumtrainingcourse() {
		seleniumtraining.click();
	}
	


}
