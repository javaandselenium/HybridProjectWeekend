package com.Ecommerce.SkillRrart.testScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

import org.testng.annotations.Test;
import org.testng.internal.annotations.TestAnnotation;

import com.Ecommerce.SkillRary.PomPages.DemoSRLogin;
import com.Ecommerce.SkillRary.PomPages.Login;
import com.Ecommerce.SkillRary.PomPages.Munit;
import com.Ecommerce.SkillRary.PomPages.Testing;
import com.Ecommerce.SkillRary.genericlibs.BaseClass;
import com.Ecommerce.SkillRary.genericlibs.Propertyfile;
import com.Ecommerce.SkillRary.genericlibs.Utilies;

public class Addtocart extends BaseClass{
	@Test
	public void addingcart() throws FileNotFoundException, IOException {
		Login l=new Login(driver);
		l.gerasActions();
		
		Utilies.switchingtabs(driver);
		
		DemoSRLogin d=new DemoSRLogin(driver);
		Utilies.dropdown(d.getCoursedd(),Propertyfile.getPropertydata("coursedd"));
		
		Testing t=new Testing(driver);
		t.munitcourse();
		
		Munit m=new Munit(driver);
		Utilies.doubleClick(driver,m.getAddbtn());
		m.addtocart();
		Utilies.alertPopup(driver);
		
		
	}

}
