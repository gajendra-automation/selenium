package repair.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rims.utils.WebDriverClass;

public class DispositionPage {
WebDriver driver;
	
public  DispositionPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}	

    @FindBy(xpath="//h4[text()='Brand Call Log']")
    private WebElement brandcalllog;
    public WebElement getbrandcalllogButton() {
	return brandcalllog;
}
	@FindBy(xpath="//h4[text()='Repair']")
	private WebElement repairButton;
	public WebElement getRepairButton() {
		return repairButton;
	}
	public void rimsDropdownClick() {
		// TODO Auto-generated method stub
		
	}
}
