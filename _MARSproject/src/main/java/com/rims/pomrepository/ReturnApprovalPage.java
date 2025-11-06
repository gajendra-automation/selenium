package com.rims.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReturnApprovalPage {
	public WebDriver driver;

	public   ReturnApprovalPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//div[@class='pa-4 box_shadow_class v-card v-sheet theme--light'])[2]")
	private WebElement warrantyClaim;
	public WebElement getwarrantyClaim() {
		return warrantyClaim;
	}
	
	@FindBy(xpath="(//tbody/tr/td[@class='text-start']/div)[1]")
	private WebElement checkbox;
	public WebElement getcheckbox() {
		return checkbox;
	}
	@FindBy(xpath="(//button[@type ='button'])[2]")
	private WebElement approveDecision;
	public WebElement getapproveDecision() {
		return approveDecision;
	}
	@FindBy(xpath="//div[text()='Approve']")
	private WebElement approveButton;
	public WebElement getapproveButton() {
		return approveButton;
	}
	@FindBy(xpath="(//div[@class='v-input__append-inner'])[2]")//
	private WebElement decisionDropdown;
	public WebElement getdecisionDropdown() {
		return decisionDropdown;
	}
	@FindBy(xpath="//div[@class='v-menu__content theme--light menuable__content__active v-autocomplete__content']//div[@role='option']")
	private WebElement decisionList;
	public WebElement getdecisionList() {
		return decisionList;
	}
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement refundPercentage;
	public WebElement getrefundPercentage() {
		return refundPercentage;
	}
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement commentsTextfield;
	public WebElement getcommentsTextfield() {
		return commentsTextfield;
	}
	@FindBy(xpath="//span[text()='Approve']")
	private WebElement finalApproveButton;
	public WebElement getfinalApproveButton() {
		return finalApproveButton;
	}
	@FindBy(xpath="(//button[@type='button'])[5]")
	private WebElement okButton;
	public WebElement getokButton() {
		return okButton;
	}

}
