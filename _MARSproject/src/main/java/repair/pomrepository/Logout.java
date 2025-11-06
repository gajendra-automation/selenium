package repair.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
WebDriver driver;
	
	public  Logout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@class='pull-right']//img[@role='button']")
	private WebElement profilebutton;
	public WebElement getProfileButton() {
		return profilebutton;
	}
	@FindBy(xpath="//span[text()='Logout']")
	private WebElement logoutbutton;
	public WebElement getLogoutButton() {
		return logoutbutton;
	}
}
