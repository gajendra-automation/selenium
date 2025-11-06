package repair.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PendingrepairPage {
WebDriver driver;
	
	public  PendingrepairPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Pending Repair']")
	private WebElement pendingrepair;
	public WebElement getPendingrepair() {
		return pendingrepair;
	}
	@FindBy(xpath="//span[text()='Dispatch']")
	private WebElement dispatchbutton;
	public WebElement getDispatchButton() {
		return dispatchbutton;
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
}
