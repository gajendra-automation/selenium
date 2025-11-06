package com.rims.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellFile {
	/**
	 * @author Dava Gajendra
	 * @param SheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	 
	public String readDataFromExcelFile(String SheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException   {
		FileInputStream fis=new FileInputStream("./src/test/resources/userdata.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String cellData = workbook.getSheet(SheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		return cellData;
	}
}
