package com.Ecommerce.SkillRrart.testScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.grid.web.servlet.handler.SeleniumBasedRequest;
import org.testng.annotations.Test;

import com.Ecommerce.SkillRary.PomPages.Login;
import com.Ecommerce.SkillRary.PomPages.Seleniumcourse;
import com.Ecommerce.SkillRary.PomPages.TakeThiscourse;
import com.Ecommerce.SkillRary.genericlibs.BaseClass;
import com.Ecommerce.SkillRary.genericlibs.Propertyfile;
import com.Ecommerce.SkillRary.genericlibs.Utilies;

public class TakeingCourses extends BaseClass{

	@Test
	public void courses() throws FileNotFoundException, IOException {
		Login l=new Login(driver);
		l.courseSeraching(Propertyfile.getPropertydata("cousename"));
	     
		Seleniumcourse s=new Seleniumcourse(driver);
		Utilies.mouseHover(driver,s.getSeleniumcouse());
		s.view();
		
		TakeThiscourse t=new TakeThiscourse(driver);
		t.takecourse();
	
	}
}
