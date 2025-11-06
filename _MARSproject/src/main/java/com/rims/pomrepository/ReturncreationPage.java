package com.rims.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rims.utils.LaunchBaseClass;

import groovy.transform.Final;

public class ReturncreationPage extends LaunchBaseClass{
public WebDriver driver;

public  ReturncreationPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="(//div[@class='pa-4 box_shadow_class v-card v-sheet theme--light'])[18]")
private WebElement setdisposition;
public WebElement getsetdisposition() {
	return setdisposition;
}
 
@FindBy(xpath="//span[text()='Create Request']")
private WebElement createReqbtn;
@FindBy(xpath="(//i[@role='button'])[5]")
private WebElement reqDropdown;
@FindBy(xpath="//div[text()='D2C Sales Return']")
private WebElement d2cSalesreq;
@FindBy(xpath="(//input[@type='text'])[3]")
private WebElement dealertxtfld;
@FindBy(xpath="(//input[@type='text'])[5]")
private WebElement contactNoTxtfld;
@FindBy(xpath="(//input[@type='text'])[7]")
private WebElement locationTxtFld;


public void clkgetcreateReqbtn() {
	createReqbtn.click();
}
public void clkreqDropdown() {
	webdriverutils.elementVisibility(driver, reqDropdown).click();
}
public void selectd2creq() {
	webdriverutils.elementVisibility(driver, d2cSalesreq).click();
}
public void enterDealer() {
	webdriverutils.elementVisibility(driver, dealertxtfld).click();
	webdriverutils.elementVisibility(driver, dealertxtfld).sendKeys("Amruth");
}
public void enterContactno() {
	webdriverutils.elementVisibility(driver, contactNoTxtfld).click();
	webdriverutils.elementVisibility(driver, contactNoTxtfld).sendKeys("7569376877");
}
public void enterlocation() {
	webdriverutils.elementVisibility(driver, locationTxtFld).click();
	webdriverutils.elementVisibility(driver, locationTxtFld).sendKeys("Bengaluru");
}





}
