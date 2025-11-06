package RIA;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.rims.pomrepository.DispositionPage1;
import com.rims.pomrepository.LoginPage;
import com.rims.pomrepository.LogoutPage;
import com.rims.utils.DataProviders;
import com.rims.utils.ExcelUtility;
import com.rims.utils.LaunchBaseClass;

public class LogIn extends LaunchBaseClass{
    @BeforeTest
	public void TC_001_Veify_login() throws IOException, InterruptedException {
		 logger.info("***Login DDT started***"); 
		 try {
		LoginPage lp =new LoginPage(driver);
		  
			
		/*
		 * String username = excelutils.readDataFromExcelFile("userdata", 1, 0); String
		 * password = excelutils.readDataFromExcelFile("userdata", 1, 1);
		 */
			
		
		  String username1 ="CSE02"; String password1 = "blubirch@123";
		 
			 
		  
			/*
			 * String un=excelutils.readDataFromExcelFile("userdata", 1, 0);
			 * System.out.println(un); String
			 * pd=excelutils.readDataFromExcelFile("userdata", 1, 1);
			 * System.out.println(pd);
			 */
			 lp.setEmail(username1);
			  lp.setPassword(password1);
			  lp.clkLogin();
			 
			
		  
		  /*Data is valid -    login succsess -testpass - logout
		   *                   login failed -test fail
		   *Dats is invalid-   login successs - test fail - logout
		   *                    login failed - test pass
		   */
		  
		/* DispositionPage1 ds = new DispositionPage1(driver);
		  boolean targetPage = ds.isDispositionPageIsDisplayed();
		  LogoutPage log=new LogoutPage(driver);
		  if(exp.equalsIgnoreCase("Valid"))
		  {
		      if(targetPage = true)
		      {
		    	  log.getlogoutButton();
		          Assert.assertTrue(true);
		      }
		      else
		      {
		          Assert.assertTrue(false);
		      }
		  }

		  if(exp.equalsIgnoreCase("Invalid"))
		  {
		      if(targetPage = true)
		      {
		    	  log.getlogoutButton();
		          Assert.assertTrue(false);
		      }
		      else
		      {
		    	  Assert.assertTrue(true);
		      }
		  }*/
		  
		 }catch(Exception e) {
			 Assert.fail();
		 }
		 
		 logger.info("***Login DDT test is completed");

	
		 }
	
			 }
