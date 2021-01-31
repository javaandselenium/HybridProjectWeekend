package com.Ecommerce.SkillRary.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsBtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoApp;
	
	@FindBy(name="q")
	private WebElement serachtb;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement go;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void gerasActions() {
		gearsBtn.click();
		demoApp.click();
	}
	
	public void courseSeraching(String cn) {
		serachtb.sendKeys(cn);
		go.click();
	}

}
