package com.rims.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rims.pomrepository.BrandcallLogPage;
import com.rims.utils.ExcelUtility;
import com.rims.utils.LaunchBaseClass;

public class BrandcallLogFileUploadTest extends LaunchBaseClass{
	BrandcallLogPage bl;
	public ExcelUtility excel;
	 public XSSFWorkbook workbook;
	    public XSSFSheet sheet;
	    public XSSFRow row;
	    public XSSFCell cell;
	    public FileInputStream fi;
	    public FileOutputStream fo;
	    public CellStyle style;
	    String path;

    @BeforeMethod
    public void setup(Method method) {
        bl = new BrandcallLogPage(driver);
        Object logger;
    }
    
    @Test(priority=1)
    public void fileDownloadInPendingBCLTickets() throws InterruptedException, AWTException {
      bl.clickBCLtab();
      bl.verifypendingBclTicketPage();
      bl.multiSelect();
      bl.clkDownloadBtn();
      bl.mainOkbutton();
      

      // STEP 3: Open and edit Excel file
       }

  private static File waitForFile(String dir, String filename) throws InterruptedException {
      File file;
      int retries = 30;
      do {
          Thread.sleep(1000);
          file = new File(dir + "/" + filename);
          retries--;
      } while (!file.exists() && retries > 0);
      return file;
  
      
          }
  @Test(priority=2)
  public void test() throws InterruptedException, IOException {
	  String downloadPath = System.getProperty("user.home") + "/Downloads";
	  System.out.println(downloadPath);
	  LocalDateTime now = LocalDateTime.now();
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HH_mm_ss");

      String formattedDateTime = now.format(formatter);
      System.out.println("Formatted Date-Time: " + formattedDateTime);
      String FilePath = downloadPath+"brand_call_log_pending_bcl_ticket_"+formattedDateTime;
      System.out.println(FilePath);
      File downloadedFile = waitForFile(downloadPath, "brand_call_log_pending_bcl_ticket_"+formattedDateTime);
	  FileInputStream fis = new FileInputStream(downloadedFile);
      workbook = new XSSFWorkbook(fis);
      XSSFSheet sheet = workbook.getSheetAt(0);

      // Modify cell A2 (row 1, col 0)
       row = sheet.getRow(1);
      if (row == null) row = sheet.createRow(1);
       cell = row.getCell(0);
      if (cell == null) cell = row.createCell(0);
      cell.setCellValue("Updated Hub Location");

      fis.close();

      // STEP 4: Save file
      FileOutputStream fos = new FileOutputStream(downloadedFile);
      workbook.write(fos);
      fos.close();
      workbook.close();

      // STEP 5: Upload edited file
      driver.get("https://your-upload-url.com");  // Replace with actual upload page
      WebElement uploadElement = driver.findElement(By.id("uploadInput")); // Adjust locator
      uploadElement.sendKeys(downloadedFile.getAbsolutePath());

      System.out.println("File uploaded successfully!");

      driver.quit();
  }
}
