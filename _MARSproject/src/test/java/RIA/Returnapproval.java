package RIA;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.rims.pomrepository.DispositionPage1;
import com.rims.pomrepository.LogoutPage;
import com.rims.pomrepository.ReturnApprovalPage;

public class Returnapproval extends LogIn {
    //@Test(priority =2)
	/*
	 * public void login() throws IOException {
	 * login("shaikhzainuddin@yopmail.com","blubirch123"); }
	 */
    
    @Test(priority = 3)
	public void returnapproval() throws InterruptedException, IOException {
//		login("shaikhzainuddin@yopmail.com","blubirch123");
//		 webdriverutils.implicitwait(driver);
		 DispositionPage1 dispo =new DispositionPage1(driver);
		 
		 //webdriverutils.elementVisibility(driver, dispo.getRIAdropdown()).click();
		 //webdriverutils.elementVisibility(driver, dispo.getreturapproval()).click();
		 ReturnApprovalPage rp =new ReturnApprovalPage(driver);
		 webdriverutils.elementVisibility(driver, rp.getwarrantyClaim()).click();
		 webdriverutils.elementVisibility(driver, rp.getcheckbox()).click();
		 webdriverutils.elementVisibility(driver, rp.getapproveDecision()).click();
		 webdriverutils.elementVisibility(driver, rp.getapproveButton()).click();
		// webdriverutils.elementVisibility(driver, rp.getapproveDecision()).click();
		 driver.findElement(By.xpath("(//div[@class='v-input__append-inner'])[2]")).click();
		 Thread.sleep(2000);
		 List<WebElement> alldecisions = driver.findElements(By.xpath("//div[@class='v-menu__content theme--light menuable__content__active v-autocomplete__content']//div[@role='option']"));
			for (WebElement onedecision : alldecisions) {
				String text = onedecision.getText();
				System.out.println(text);
				if(text.equalsIgnoreCase("Refund with Return of item with Depreciation")) {
					onedecision.click();
					Thread.sleep(2000);
				}
			}
			
			webdriverutils.elementVisibility(driver, rp.getrefundPercentage()).click();
			webdriverutils.elementVisibility(driver, rp.getrefundPercentage()).clear();
			webdriverutils.elementVisibility(driver, rp.getrefundPercentage()).sendKeys(fileutils1.readDataFromPropertyFile("refundpercentage"));
			webdriverutils.elementVisibility(driver, rp.getcommentsTextfield()).click();
			webdriverutils.elementVisibility(driver, rp.getcommentsTextfield()).sendKeys(fileutils1.readDataFromPropertyFile("comment"));
			webdriverutils.elementVisibility(driver, rp.getfinalApproveButton()).click();
			Thread.sleep(2000);
			webdriverutils.elementVisibility(driver, rp.getokButton()).click();
			Thread.sleep(4000);
			/*
			 * Logout lo=new Logout(); lo.logout();
			 * login("shaikhzainuddin@yopmail.com","blubirch123");
			 */	 
	}
   
    /*public void logout()  throws IOException, InterruptedException {
    	LogoutPage lo=new LogoutPage(driver);
    	webdriverutils.elementVisibility(driver, lo.getprofileIcon()).click();
    	webdriverutils.elementVisibility(driver, lo.getlogoutButton()).click();
    	Thread.sleep(5000);
    	}*/
		/*
		 * @Test(priority =5) public void approvalUsers() throws IOException,
		 * InterruptedException { login("bishorkurian@yopmail.com","blubirch123");
		 * returnapproval(); Thread.sleep(5000); logout();
		 * login("akashdixit@yopmail.com","blubirch123"); returnapproval();
		 * Thread.sleep(5000); logout(); login("girishshah@yopmail.com","blubirch123");
		 * returnapproval(); Thread.sleep(5000); logout();
		 * 
		 * 
		 * }
		 */
    
}
