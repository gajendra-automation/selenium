package com.rims.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.rims.utils.LaunchBaseClass;

public class BrandcallLogPage extends LaunchBaseClass {
	
	WebDriver driver;
	public BrandcallLogPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Locators of pending confirmation page
	@FindBy(xpath="//h4[text()='Brand Call Log']")
	private WebElement bcltab;
	@FindBy(xpath="(//div[@class='card-sub-header-value'])[1]")
	private WebElement bclQuantity;
	@FindBy(xpath="(//div[@class='card-sub-header-value'])[3]")
	private WebElement bucketAgeing;
	@FindBy(xpath="(//div[@class='card-sub-header-value'])[2]")
	private WebElement bclValue;
	@FindBy(xpath="//span[text()='Pending Information']")
	private WebElement pendingconfirmationTab;
	@FindBy(xpath="(//div[@class='v-selection-control__wrapper'])[2]")
	private WebElement selectFirstRecord;
	@FindBy(xpath="(//div[@class='v-selection-control__wrapper'])[3]")
	private WebElement selectSecondRecord;
	@FindBy(xpath="(//div[@class='v-selection-control__wrapper'])[4]")
	private WebElement selectThirdRecord;
	
	@FindBy(xpath="//button[@type='button']/span[text()='Update']")
	private WebElement updateButton;
	@FindBy(xpath="//span[text()='Download']")
	private WebElement  DownloadBtn;
	@FindBy(xpath="(//div[@class='v-field__append-inner']//i[@role='button'])[3]")
	private WebElement selectDataFieldDropdown;
	//@FindBy(xpath="//div[@role = 'listbox' and @tabindex='-1']")
	@FindBy(xpath="(//input[@type='text'])[6]")
	private WebElement selectfieldDropdownList;
	@FindBy(xpath="(//div[@class='v-field__append-inner']//i[@role='button'])[4]")
	private WebElement selectDataFieldDropdown2;
	@FindBy(xpath="(//div[@class='v-field__append-inner']//i[@role='button'])[5]")
	private WebElement selectDataFieldDropdown3;
	
	@FindBy(xpath="(//div[@tabindex='-2'])[3]")
	WebElement selectField;
	@FindBy(xpath="//input[@aria-expanded='undefined']")
	WebElement updateDate;
	@FindBy(xpath="//div[@data-v-date='2025-06-01']")
	WebElement selectDate;
	@FindBy(xpath="//span[text()='Ok']")
	WebElement okButon;
	@FindBy(xpath="(//button[@type='button'])[15]")
	WebElement addDataField;
	@FindBy(xpath="(//input[@type='text'])[11]")
	WebElement txtUpdateVendor;
	@FindBy(xpath="(//div[@class='v-field__append-inner']//i[@role='button'])[6]")
	private WebElement selectDataFieldDropdown4;
	@FindBy(xpath="(//input[@type='text'])[13]")
	WebElement txtUpdateRecieDC;
	@FindBy(xpath="//span[text()='Submit']")
	WebElement submitBtn;
	//Locators of pending BCL tickets page
	@FindBy(xpath="//span[text()='Pending BCL Tickets']")
	WebElement pendingBclTickets;
	@FindBy(xpath="(//div[@class='v-card-text']//input[@type='text'])[1]")
	WebElement ticketNo;
	@FindBy(xpath="//div[@class='v-row']//div[@class='v-card-text text-center']")
	WebElement confMessage;
	
	//Locators of pending inspection page
	@FindBy(xpath="//span[text()='Pending Inspection']")
	WebElement pendingConfirmationTab;
	@FindBy(xpath="//div[@class='v-input__prepend']")
	WebElement inspectionReport;
	
	//Locators of pending decision page
	@FindBy(xpath="//span[text()='Pending Decision']")
	WebElement pendingDecisionTab;
	@FindBy(xpath="(//div[@class='v-card-text']//input[@type='text'])[2]")
	WebElement BARefNum;
	
	//Action mesthod of brandcall log module tab
	public void verifyBclTabInfo() throws InterruptedException {
		String expectedbclTabText=bcltab.getText();
		System.out.println(expectedbclTabText);
		String actualbclTabText = "Brand Call Log";
		if(actualbclTabText.equals(expectedbclTabText)) {
			System.out.println("BCL Tab is displayed");
			int totalBclQty = Integer.parseInt(bclQuantity.getText());
			System.out.println("Items quantity in brandcallLog Module "+totalBclQty);
			Thread.sleep(2000);
			String bucketAgeingInDays =bucketAgeing.getText();
			System.out.println("All the items ageing in bcl Module "+bucketAgeingInDays);
			String totalValue = bclValue.getText();
			System.out.println("Total value of BCL Module "+totalValue);
		}
	}
	
	//Action methods for pending confirmation page
	public void clickBCLtab() throws InterruptedException {
		webdriverutils.elementVisibility(driver, bcltab).click();;
		Thread.sleep(5000);
		}
	public boolean isPenndingConfirmationTabisDisplayed(){
		return(pendingconfirmationTab.isDisplayed());
	}
	public boolean isRecordsArePresent() {
		return(selectFirstRecord.isEnabled());
	}
	public boolean isFirstCheckboxEnabled() {
		return(selectFirstRecord.isEnabled());
	}
	public void selectFirstRecord() {
		webdriverutils.elementVisibility(driver,selectFirstRecord).click();
	}
	public void clickUpdateButton() throws InterruptedException {
		webdriverutils.elementVisibility(driver,updateButton).click();
	}
	public void clkSelectDataFieldDropdown() throws InterruptedException {
		webdriverutils.elementVisibility(driver,selectDataFieldDropdown).click();
	}
	public void selectValue() {
		webdriverutils.elementVisibility(driver, selectField).click();
	}
	public void ClkUpdateDate() throws InterruptedException {
		webdriverutils.elementVisibility(driver,updateDate).click();
		webdriverutils.elementVisibility(driver,selectDate).click();
		webdriverutils.elementVisibility(driver,okButon).click();
	}
	public void clkAddDatafield() throws InterruptedException {
		webdriverutils.elementVisibility(driver,addDataField).click();
	}
	public void clkSelectDataFieldDropdown2() throws InterruptedException {
		webdriverutils.elementVisibility(driver,selectDataFieldDropdown2).click();
	}
	public void clkSelectDataFieldDropdown3() throws InterruptedException {
		webdriverutils.elementVisibility(driver,selectDataFieldDropdown3).click();
	}
	public void txtUpdateVendor(String vendorCode) {
		webdriverutils.elementVisibility(driver,txtUpdateVendor).sendKeys(vendorCode);
	}
	public void clkSelectDataFieldDropdown4() throws InterruptedException {
		webdriverutils.elementVisibility(driver,selectDataFieldDropdown4).click();
	}
	public void txtUpdatetxtUpdateRecieDC(String ReciveDc) {
		webdriverutils.elementVisibility(driver,txtUpdateRecieDC).sendKeys(ReciveDc);
	}
	public void btnSubmit() {
		webdriverutils.elementVisibility(driver, submitBtn).click();
	}
	public void btnOK() {
		webdriverutils.elementVisibility(driver, okButon).click();
	}
	
			
	//Action methods for pending bcl tickets page
	public void verifypendingBclTicketPage() {
		webdriverutils.elementVisibility(driver,pendingBclTickets).click();
	}
		
	public void selectFirstrecord() {
		webdriverutils.elementVisibility(driver, selectFirstRecord).click();
		
	}
	public void clkUpdateButton() {
		webdriverutils.elementVisibility(driver, updateButton).click();
		
	}
	public void clkTxtTicketNo() throws InterruptedException {
	ticketNo.click();
	}
	public void enterTktNumber() {
		ticketNo.sendKeys(randomNumber());
	}
	public void updateDate() {
		updateDate.click();
	}
	public void selectDate() {
		webdriverutils.elementVisibility(driver,selectDate).click();
	}
	public void clickOKButton() {
		webdriverutils.elementVisibility(driver,okButon).click();
	}
	public void submitButton() {
		webdriverutils.elementVisibility(driver,submitBtn).click();
	}
	public void mainOkbutton() {
		webdriverutils.elementVisibility(driver,okButon).click();
	}
	public String getConfMessage() {
		return(confMessage.getText());
	}
	public void clkpendingConfirmationTab() {
		webdriverutils.elementVisibility(driver,pendingConfirmationTab).click();
	}
	public void attachInspectionReport() {
		webdriverutils.elementVisibility(driver, inspectionReport).click();
		String filePath="C:\\Users\\Blubirch.DESKTOP-EN2LGLN\\Downloads\\file_name(6) (1)";
		uploadFileWithRobot(filePath);
	}
	
	//Action method for pending decision tab
	public void clkPendingDecisionTab() {
		pendingDecisionTab.click();
	}
	public void typeBARefNumber() {
		BARefNum.sendKeys(randomNumber());
	}
	
	
	public void multiSelect() {
		webdriverutils.elementVisibility(driver, selectFirstRecord).click();
		webdriverutils.elementVisibility(driver, selectSecondRecord).click();
		webdriverutils.elementVisibility(driver, selectThirdRecord).click();
	}
	public void clkDownloadBtn() {
		webdriverutils.elementVisibility(driver, DownloadBtn).click();
	}
	
	
}
