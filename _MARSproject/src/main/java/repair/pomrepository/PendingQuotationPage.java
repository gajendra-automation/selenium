package repair.pomrepository;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PendingQuotationPage {
	
WebDriver driver;
	
	public  PendingQuotationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//td[@class='text-start']//u[1]")
	private WebElement firsttag;
	public WebElement getFirsttag() {
		return firsttag;
	}
	@FindBy(xpath="//a[text()='Pending Quotation']")
	private WebElement pendingquotation;
	public WebElement getpendingquotation() {
		return pendingquotation;
	}
	@FindBy(xpath="//tr[1]//td")
	private WebElement firstRecord;
	public WebElement getfirstRecord() {
		return firstRecord;
	}
	@FindBy(xpath="//span[text()='UPDATE']")
	private WebElement updateButton;
	public WebElement getUpdateButton() {
		return updateButton;
	}
	@FindBy(xpath="//div[@class='v-card__text']")
	private WebElement updatePopup;
	public WebElement getUpdatePopup() {
		return updatePopup;
	}
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement vendorName;
	public WebElement getVendorName() {
		return vendorName;
	}
	@FindBy(xpath="//div[text()='Bluestar Limited APS Har']")
	private WebElement vendorname1;
	public WebElement getVendorname1() {
		return vendorname1;
	}
	@FindBy(xpath="//input[@required='required']")
	private WebElement repairQuotationValue;
	public WebElement getRepairQuotationValue() {
		return repairQuotationValue;
	}
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement repairType;
	public WebElement getRepairType() {
		return repairType;
	}
	@FindBy(xpath="//div[text()='Service center']")
	private WebElement servicecenter;
	public WebElement getservicecenter() {
		return servicecenter;
	}
	@FindBy(xpath="(//input[@type='text'])[6]")
	private WebElement expectedRevisedGrade;
	public WebElement getExpectedRevisedGrade() {
		return expectedRevisedGrade;
	}
	@FindBy(xpath="//div[text()='Damaged']")
	private WebElement damaged;
	public WebElement getDamaged() {
		return damaged;
	}
	@FindBy(xpath="//div[@class='v-text-field__slot']//div")
	private WebElement uploadquotation;
	public WebElement getuploadquotation() {
		return uploadquotation;
	}
	@FindBy(xpath="//span[text()='Submit']")
	private WebElement submitButton;
	public WebElement getSubmitButton() {
		return submitButton;
	}
	@FindBy(xpath="//span[text()='Ok']")
	private WebElement okButton;
	public WebElement getOKButton() {
		return okButton;
	}
	
}
