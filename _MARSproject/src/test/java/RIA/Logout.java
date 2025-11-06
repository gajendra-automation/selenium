package RIA;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.rims.pomrepository.LogoutPage;
import com.rims.utils.LaunchBaseClass;

public class Logout extends LaunchBaseClass{
    @Test(priority =2)
	public void logout()  throws IOException, InterruptedException {
	LogoutPage lo=new LogoutPage(driver);
    lo.clkProfileIcon();
    Thread.sleep(3000);
	lo.getlogoutButton();
	}
}
