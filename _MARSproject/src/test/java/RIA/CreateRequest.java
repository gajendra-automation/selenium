package RIA;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rims.pomrepository.ReturncreationPage;
import com.rims.utils.LaunchBaseClass;

public class CreateRequest extends LaunchBaseClass{
	ReturncreationPage rp;
	@BeforeMethod
    public void setup(Method method) {
        rp = new ReturncreationPage(driver);
        Object logger;
    }
    @Test(priority = 1)
	public void create() throws InterruptedException {
    	rp.clkgetcreateReqbtn();
    	rp.clkreqDropdown();
    	rp.selectd2creq();
    	Thread.sleep(3000);
    	rp.enterDealer();
    	rp.enterContactno();
    	rp.enterlocation();
	}
}
