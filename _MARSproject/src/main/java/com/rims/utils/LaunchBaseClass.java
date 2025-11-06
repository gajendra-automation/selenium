package com.rims.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class LaunchBaseClass {
	public static WebDriver driver;
	protected static final Logger logger = LogManager.getLogger(LaunchBaseClass.class);
	public 	FileUploadClass fileutils1=new FileUploadClass();
	public WebDriverClass webdriverutils=new WebDriverClass();
	public ExcellFile excelutils=new ExcellFile();
	public JavaClass javautils=new JavaClass();
	public ExcelUtility excel;
	
	@BeforeTest(groups ={"Sanity","Master","Regression"})
	@Parameters({"os","browser"})
	public void setup(String os,String br) throws IOException, InterruptedException {
		if(br.equals("chrome")) { 
			System.setProperty("webdriver.chrome.driver",
					  "C:\\Users\\Blubirch.DESKTOP-EN2LGLN\\Downloads\\chromedriver-win64 (6)\\chromedriver-win64\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(br.equals("edge")) {
			driver=new EdgeDriver();
		}else if(br.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("Invalid Browser...!");
		}
		driver.manage().window().maximize();
		driver.get(fileutils1.readDataFromPropertyFile("url"));
		driver.manage().deleteAllCookies();

	}
	
	public void failed(String testMethodName) {
	    try {
	    	File filePath1=new File("./errorshots/image1.png");
	        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(screenshot,filePath1 );
	        System.out.println("Screenshot saved at: " + filePath1);
	    } catch (Exception e) {
	        System.out.println("Exception while taking screenshot: " + e.getMessage());
	        e.printStackTrace();
	    }
	}
	
	public String captureScreen(String tname) throws IOException {

	    String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

	    TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	    File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

	    String targetFilePath = System.getProperty("user.dir") + "\\errorshots\\" + tname + "_" + timeStamp + ".png";
	    File targetFile = new File(targetFilePath);

	    sourceFile.renameTo(targetFile);

	    return targetFilePath;
	}


	public void uploadFileWithRobot(String filePath) {
	    try {
	        // Copy file path to clipboard
	        StringSelection selection = new StringSelection(filePath);
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

	        // Wait for dialog to appear
	        Thread.sleep(1000);

	        // Create robot instance
	        Robot robot = new Robot();

	        // Press CTRL+V
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_CONTROL);

	        // Press Enter
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);

	    } catch (AWTException | InterruptedException e) {
	        e.printStackTrace();
	    }
	}

	
//	@AfterClass
//	public void teardown() {
//		driver.quit();
//	}
	
	public String randomString() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	public String randomNumber() {
		String generatedNumber = RandomStringUtils.randomNumeric(10);
		return generatedNumber;
	}
	public String randomAlphaNumeric() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		String generatedNumber = RandomStringUtils.randomNumeric(2);
		return (generatedString+generatedNumber);
	}
	
	
}
