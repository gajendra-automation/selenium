package com.rims.utils;


import java.io.File;
import java.time.LocalDateTime;

public class JavaClass {
	public void timeStamp() {
		String timeStamp =LocalDateTime.now().toString().replace(':', '-');
	}
	
	public static File waitForFile(String dir, String filename) throws InterruptedException {
        File file;
        int retries = 30;
        do {
            Thread.sleep(1000);
            file = new File(dir + "/" + filename);
            retries--;
        } while (!file.exists() && retries > 0);
        return file;
    }
	
	
}
