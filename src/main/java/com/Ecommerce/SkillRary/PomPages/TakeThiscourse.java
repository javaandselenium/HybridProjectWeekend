package com.Ecommerce.SkillRary.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TakeThiscourse {
	@FindBy(xpath="//a[text()=' TAKE THIS COURSE ']")
	private WebElement takethiscourse;
	
	public TakeThiscourse(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void takecourse() {
		takethiscourse.click();
	}

}
