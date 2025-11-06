package repair.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WareHouseMPage {
WebDriver driver;
	
	public  WareHouseMPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='col-sm-3 col-md-3 col-3'][3]")
	private WebElement disposition;
	public WebElement getdisposition() {
		return disposition;
	}
}
