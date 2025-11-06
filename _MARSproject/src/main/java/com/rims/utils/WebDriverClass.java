package com.rims.utils;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverClass {
 	/**
 	 * This method will provide the implicitwait for every invocation of the findElement()
 	 * @author Gajendra
 	 * @param driver
 	 */
 public void implicitwait(WebDriver driver) {
 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
 }
 /**
  * This method will return the interractable element 
  * @author jagadish
  * @param driver
  * @param object
  * @return WebElement
  */

   public WebElement elementVisibility(WebDriver driver, WebElement element) {
   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
   WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(element));
   return visibleElement;//TimeOutException
   
   }
  
 /**
  * This method is uesd to validate the webpage Title
  * @author karthik
  * @param driver
  * @param expectedTitle
  * @return boolean
  */
 public boolean toVerifyCompleteTitle(WebDriver driver, String expectedTitle) {
 	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
 	Boolean validation = wait.until(ExpectedConditions.titleIs(expectedTitle));
 	return validation;
 }
 /**
  * @author Gajendra
  * @param driver
  * @param fractionOfUrl
  * @return Boolean
  */
 public boolean toVerifyPartialUrl(WebDriver driver,String fractionOfUrl) {
 	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
 	Boolean validation = wait.until(ExpectedConditions.urlContains(fractionOfUrl));
 	return validation;
 	
 }
 
}
