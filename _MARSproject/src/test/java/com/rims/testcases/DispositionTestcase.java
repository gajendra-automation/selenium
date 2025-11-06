package com.rims.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.rims.pomrepository.BrandcallLogPage;
import com.rims.pomrepository.DispositionPage1;
import com.rims.utils.LaunchBaseClass;

import RIA.LogIn;
import junit.framework.Assert;



public class DispositionTestcase extends LaunchBaseClass{
	
	DispositionPage1 ds;
	BrandcallLogPage bl;
	@BeforeTest
	public void dispo(){
		ds=new DispositionPage1(driver);
		bl=new BrandcallLogPage(driver);	
	}
	@Test(priority =1)
	public void TC_riaDropdownClick() throws InterruptedException {
		ds.riaDropdownClick();
	}
	
	
	@Test(enabled=false)
	public void TC_002_verifyBclTab() throws InterruptedException {
		bl.verifyBclTabInfo();
		System.out.println("Verified all the BCl information...");
	}
	
}
