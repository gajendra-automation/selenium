package com.rims.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUploadClass {
	/** this method wiil give the value from the property file upon giving key as the input
	 * @author Gajendra
	 * @param key
	 * @return value
	 * @throws IOException
	 */
	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Blubirch.DESKTOP-EN2LGLN\\eclipse-workspace\\_RIMSproject\\src\\test\\resources\\rimscommondata.properties.txt");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(key);
		return value;
	}
}
