package applitool1.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserOpen {
	public static void main(String args[]) {
		try {
			ChromeOptions co= new ChromeOptions();
			co.addArguments("--remote-allow-origin=*");
			WebDriver driver= new ChromeDriver(co);
			driver.get("https://demo.applitools.com/");
			TakeScreenShot.takeScreenShot(driver);//1
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("username")).sendKeys(RandomDataCreation.getNumericString(10));
			driver.findElement(By.id("password")).sendKeys(RandomDataCreation.getAlphaNumericString(10));
			driver.findElement(By.id("log-in")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			TakeScreenShot.takeScreenShot(driver);//2
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
