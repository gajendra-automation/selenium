package repair.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pendingdispositionPage {
WebDriver driver;
	
	public  void pendingdispositionPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Pending Disposition']")
	private WebElement pendingdisposition;
	public WebElement getpendingdisposition() {
		return pendingdisposition;
	}
	@FindBy(xpath="//span[text()='Approve']")
	private WebElement approvebutton;
	public WebElement getApproveButton() {
		return approvebutton;
	}
	@FindBy(xpath="//span[text()='Reject']")
	private WebElement rejectbutton;
	public WebElement getRejectButton() {
		return rejectbutton;
	}
	@FindBy(xpath="//span[text()='Yes']")
	private WebElement yesbutton;
	public WebElement getyesButton() {
		return yesbutton;
	}
	@FindBy(xpath="//span[text()='Ok']")
	private WebElement okButton;
	public WebElement getOKButton() {
		return okButton;
	}
	@FindBy(xpath="//button[@role='button']")
	private WebElement assigndisposition;
	public WebElement getAssigndisposition() {
		return assigndisposition;
	}
	@FindBy(xpath="//div[text()='Liquidation']")
	private WebElement liquidation;
	public WebElement getLiquidation() {
		return liquidation;
	}
	
}
