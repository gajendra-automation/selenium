package com.rims.pomrepository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.rims.utils.LaunchBaseClass;
public class InsurancePage extends LaunchBaseClass{
	WebDriver driver;
	
	public InsurancePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators of all insurance module pages
	@FindBy(xpath = "//h4[text()=' Insurance ']")
	WebElement insuranceTab;
	@FindBy(xpath="(//div[@class='card-sub-header-value'])[7]")
	private WebElement insQuantity;
	@FindBy(xpath="(//div[@class='card-sub-header-value'])[8]")
	private WebElement insBucketAgeing;
	@FindBy(xpath="(//div[@class='card-sub-header-value'])[9]")
	private WebElement insValue;
	
	//Common elements for all the subpages
	@FindBy(xpath="(//div[@class='v-selection-control__wrapper'])[2]")
	private WebElement selectFirstRecord;
	@FindBy(xpath="//button[@type='button']/span[text()='Update']")
	private WebElement updateButton;
	
	//Locators for pending claim ticket page
	
	@FindBy(xpath="//span[text()='Pending Claim Ticket']")
	private WebElement pendingClaimTktTab;
	@FindBy(xpath="(//div[@class='v-input__control'])[6]")
	private WebElement insuranceClaimTicketDate;
	@FindBy(xpath="//div[@data-v-date='2025-06-25']")
	private WebElement selectDate;
	@FindBy(xpath="//span[text()='Ok']")
	private WebElement okButon;
	@FindBy(xpath="//div[@class='v-container v-locale--is-ltr']//div[@class='v-col-sm-4 v-col-md-6 v-col-12']")
	private WebElement txtInsClaimTktNo;
	@FindBy(xpath="//span[text()='Submit']")
	WebElement submitBtn;
	
	//Locators for pending inspection tab
	@FindBy(xpath="//span[text()='Pending Inspection']")
	private WebElement pendingInspectionTab;
	@FindBy(xpath="//div[@class='v-input__prepend']")
	WebElement inspectionReport;
	
	
	public void verifyInsTabInfo() throws InterruptedException {
		String expectedbclTabText=insuranceTab.getText();
		System.out.println(expectedbclTabText);
		String actualbclTabText = "Insurance";
		if(actualbclTabText.equals(expectedbclTabText)) {
			System.out.println("Insurance Tab is displayed");
			int totalBclQty = Integer.parseInt(insQuantity.getText());
			System.out.println("Items quantity in insurance Module "+totalBclQty);
			Thread.sleep(2000);
			String bucketAgeingInDays =insBucketAgeing.getText();
			System.out.println("All the items ageing in insurance Module "+bucketAgeingInDays);
			String totalValue = insValue.getText();
			System.out.println("Total value of insurance Module "+totalValue);
		}
			}
	
	public void clkInsuranceTab() {
		webdriverutils.elementVisibility(driver, insuranceTab).click();
	}
	public void clkPendingClaimTktTab() {
		webdriverutils.elementVisibility(driver, pendingClaimTktTab).click();
	}
	public void selectFirstRecord() {
		webdriverutils.elementVisibility(driver, selectFirstRecord).click();
	}
	public void clkUpdateBtn() {
		webdriverutils.elementVisibility(driver, updateButton).click();
	}
	public void clkInsuranceClaimTicketDate() {
		webdriverutils.elementVisibility(driver, insuranceClaimTicketDate).click();
	}
	public void selectDate() {
		webdriverutils.elementVisibility(driver, selectDate).click();
	}
	public void clkOKbutton() {
		webdriverutils.elementVisibility(driver, okButon).click();
	}
	public void etrInsClaimTktNo(String Number) {
		//webdriverutils.elementVisibility(driver, txtInsClaimTktNo).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(4000));
		WebElement txt = wait.until(ExpectedConditions.visibilityOf(txtInsClaimTktNo));
		Actions act=new Actions(driver);
		act.moveToElement(txt).click().build().perform();
		act.moveToElement(txt).sendKeys(Number).build().perform();
		//WebElement webelement = wait.until(ExpectedConditions.invisibilityOfElementLocated(txtInsClaimTktNo));
	}
	public void clkSubmitBtn() {
		webdriverutils.elementVisibility(driver, submitBtn).click();
	}
	public void clkOKbtn() {
		webdriverutils.elementVisibility(driver, okButon).click();
	}
	
	//Action methods for pending inspection tab
	public void clkPendingInspectionTab() {
		webdriverutils.elementVisibility(driver, pendingInspectionTab).click();
	}
	public void selectInspectionDate() {
		webdriverutils.elementVisibility(driver, insuranceClaimTicketDate).click();
	}
	public void attachInspectionReport() {
		webdriverutils.elementVisibility(driver, inspectionReport).click();
		String filePath="C:\\Users\\Blubirch.DESKTOP-EN2LGLN\\Downloads\\file_name(6) (1)";
		uploadFileWithRobot(filePath);
	}
	
}
