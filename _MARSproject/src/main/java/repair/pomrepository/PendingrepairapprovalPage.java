package repair.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PendingrepairapprovalPage {
WebDriver driver;
	
	public  PendingrepairapprovalPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Pending Repair Approval']")
	private WebElement pendingrepairapproval;
	public WebElement getPendingrepairapproval() {
		return pendingrepairapproval;
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
		return yesbutton;//*[@id="”app”"]/div[4]/div/div/div[3]/button/span
	}
	@FindBy(xpath="(//button[@type='button']/child::span[text()='Yes'])[1]")
	private WebElement yes2button;
	public WebElement getyes2Button() {
		return yes2button;
	}
	@FindBy(xpath="//span[text()='Ok']")
	private WebElement okButton;
	public WebElement getOKButton() {
		return okButton;
	}
}
