package applitool1.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
import java.util.Date;
public class TakeScreenShot {
	public static void takeScreenShot(WebDriver driver) throws IOException{
		try {
	        TakesScreenshot scrShot =((TakesScreenshot)driver);
	        //Call getScreenshotAs method to create image file
	        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	        Date currentDate=new Date();
	        String screenshotFileName=currentDate.toString().replace(":",".");
	        //Move image file to new destination
	        File DestFile=new File("C:\\Users\\lenovo\\OneDrive\\Documents\\Selenium\\Screenshot\\"+screenshotFileName+".png");
	        FileHandler.copy(SrcFile, DestFile);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
