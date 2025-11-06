package com.rims.pomrepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.rims.utils.LaunchBaseClass;

public class DispositionPage1 extends LaunchBaseClass{
public WebDriver driver;
	
public  DispositionPage1(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}	
@FindBy(xpath="(//div[@class='side_navbar sidebar-collapsed']//div[@tabindex='0'])[1]")
private WebElement RIAdropdown;
@FindBy(xpath="//v-list-item-content[@id='button_2']")
private WebElement RIMSdropdown;
@FindBy(xpath="//span[text()='Disposition']")
private WebElement disposition;
@FindBy(xpath="//h4[text()='Brand Call-Log']")
private WebElement brandcalllog;
@FindBy(xpath="(//h3[text()='Quantity - '])[2]")
private WebElement quantity;
	

Actions ac=new Actions(driver);
	public void riaDropdownClick() throws InterruptedException {
        Thread.sleep(3000);
		ac.moveToElement(RIAdropdown).click().build().perform();
		Thread.sleep(3000);
	}
	public void rimsDropdownClick() throws InterruptedException {
		Thread.sleep(3000);
		
		ac.moveToElement(RIMSdropdown).click().build().perform();
		Thread.sleep(3000);
		//disposition.click();
	}
	
	public boolean isDispositionPageIsDisplayed() {
		String actualUrl = "https://qa-reseller.blubirch.com:3805/api/v2/reverse/disposition";
		String expectedUrl=driver.getCurrentUrl();
		return (actualUrl.equals(expectedUrl));
	}
	
}
