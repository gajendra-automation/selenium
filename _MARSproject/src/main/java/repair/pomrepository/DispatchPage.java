package repair.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DispatchPage {
WebDriver driver;
	
	public DispatchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Dispatch']")
	private WebElement dispatch;
	public WebElement getdispatch() {
		return dispatch;
	}
}
