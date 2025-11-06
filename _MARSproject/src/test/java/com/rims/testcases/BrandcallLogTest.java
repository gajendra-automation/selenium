package com.rims.testcases;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rims.pomrepository.BrandcallLogPage;
import com.rims.pomrepository.DispositionPage1;
import com.rims.utils.LaunchBaseClass;

import repair.pomrepository.DispositionPage;

public class BrandcallLogTest extends LaunchBaseClass {
    BrandcallLogPage bl;
    DispositionPage1 dp;
    
    @BeforeMethod
    public void setup(Method method) {
        bl = new BrandcallLogPage(driver);
        dp=new DispositionPage1(driver);
        logger.info("=== Starting test: " + method.getName() + " ===");
    }
    
    @Test(priority = 1, groups ={"Sanity","Master","Regression"})
    public void TC_003_ClickBCLmodule() throws InterruptedException {
    	    webdriverutils.implicitwait(driver);
            logger.info("*** Test execution started ***");
            bl.clickBCLtab();
            String expectedBCLurl = "https://qa-reseller.blubirch.com:3805/api/v2/reverse/Brand-call-log";
            String actualBCLurl = driver.getCurrentUrl();
            if (expectedBCLurl.equals(actualBCLurl)) {
                logger.info("Brandcall log module is displayed");
                System.out.println("Brandcall log module is displayed");
                Thread.sleep(4000); 
            } else {
                logger.error("Brandcall log module is not displayed");
                System.out.println("Brandcall log module is not displayed");
            }
    }
    
    @Test(enabled = false,groups ={"Sanity","Master"})
    public void TC_004_VerifyPendingConfirmationPage() {
    	webdriverutils.implicitwait(driver);
        Assert.assertEquals(bl.isPenndingConfirmationTabisDisplayed(), true);
    }
    
    @Test(enabled = false,groups ={"Sanity","Master"})
    public void TC_005_IsRecordsArePresent() throws InterruptedException {
    	webdriverutils.implicitwait(driver);
    	Assert.assertEquals(bl.isRecordsArePresent(), true);
    	Assert.assertTrue(bl.isFirstCheckboxEnabled(), "UpdateButton is Enabled");
    	bl.selectFirstrecord();
    	bl.clickUpdateButton();
    	bl.clkSelectDataFieldDropdown();
    	bl.selectValue();
    	bl.ClkUpdateDate();
    	bl.clkAddDatafield();
    	//Select secondvalue from the dropdown
    	bl.clkSelectDataFieldDropdown2();
    	bl.selectValue();
    	bl.clkAddDatafield();
    	bl.clkSelectDataFieldDropdown3();
    	bl.txtUpdateVendor(randomNumber());
    	bl.clkAddDatafield();
    	bl.clkSelectDataFieldDropdown4();
    	bl.selectValue();
    	bl.txtUpdatetxtUpdateRecieDC(randomAlphaNumeric());
    }
    
    @Test(priority=2,groups ={"Regression","Master"})
    public void TC_00_6verifypendingBclTicketPage() {
    	webdriverutils.implicitwait(driver);
    try {
            bl.verifypendingBclTicketPage();
            Thread.sleep(4000);
            bl.selectFirstrecord();
            bl.clkUpdateButton();
            Thread.sleep(3000);
            bl.clkTxtTicketNo();
            Thread.sleep(2000);
            bl.enterTktNumber();
            Thread.sleep(2000);
            bl.updateDate();
            Thread.sleep(2000);
            bl.selectDate();
            bl.clickOKButton();
            bl.submitButton();
            bl.mainOkbutton();

            

        } catch (Exception e) {
            logger.error("Test failed due to exception: ", e);
            logger.debug("Debug started....");
        }
    }
    @Test(priority =3,groups ={"Regression","Master"})
    public void TC_007_verifyPendingConfirmationPage() throws InterruptedException {
    	try {
    	webdriverutils.implicitwait(driver);
    	bl.clkpendingConfirmationTab();
    	bl.selectFirstrecord();
        bl.clkUpdateButton();
        bl.updateDate();
        bl.selectDate();
        bl.clickOKButton();
        Thread.sleep(4000);
        bl.attachInspectionReport();
        bl.submitButton();
        bl.mainOkbutton();
    	}catch (Exception e) {
            logger.error("Test failed due to exception: ", e);
            logger.debug("Debug started....");
        }
    }
    
    @Test(priority=4, groups ={"Regression","Master"})
    public void TC_008verifyPendingDecisionPage() throws InterruptedException {
    	try {
    	bl.clkPendingDecisionTab();
    	bl.selectFirstrecord();
        bl.clkUpdateButton();
        bl.clkSelectDataFieldDropdown();
        bl.selectValue();
        bl.typeBARefNumber();  
        bl.submitButton();
        bl.mainOkbutton();
        dp.rimsDropdownClick();
    	}
    	catch (Exception e) {
            logger.error("Test failed due to exception: ", e);
            logger.debug("Debug started....");
        }
        logger.info("*** Test completed successfully ***");
    }
}
