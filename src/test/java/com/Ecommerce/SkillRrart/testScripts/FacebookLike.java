package com.Ecommerce.SkillRrart.testScripts;

import org.testng.annotations.Test;

import com.Ecommerce.SkillRary.PomPages.DemoSRLogin;
import com.Ecommerce.SkillRary.PomPages.Facebook;
import com.Ecommerce.SkillRary.PomPages.Login;
import com.Ecommerce.SkillRary.PomPages.Munit;
import com.Ecommerce.SkillRary.genericlibs.BaseClass;
import com.Ecommerce.SkillRary.genericlibs.Utilies;

public class FacebookLike extends BaseClass{
	@Test
	public void facebooklike() {
		Login l=new Login(driver);
		l.gerasActions();
		
		Utilies.switchingtabs(driver);
		
		DemoSRLogin d=new DemoSRLogin(driver);
		Utilies.mouseHover(driver,d.getCoursebtn());
		d.seleniumtrainingcourse();
		
		Munit m=new Munit(driver);
		m.fbBtn();
		
		Facebook f=new Facebook(driver);
		f.likebtn();
		
	}

}
