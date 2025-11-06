package repair.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepairLoginPage {
WebDriver driver;
	
	public  RepairLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='input-14']")
	private WebElement emailTextfield;
	public WebElement getemailTextfield() {
		return emailTextfield;
	}
	@FindBy(xpath="//input[@id='input-17']")
	private WebElement passwordTextField;
	public WebElement getpasswordTextField() {
		return passwordTextField;
	}
	@FindBy(xpath="//span[text()='Sign in']")
	private WebElement signinButton;
	public WebElement getsigninButton() {
		return signinButton;
	}
}
