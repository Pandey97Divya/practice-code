package newproject.newassert;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import junit.framework.Assert;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        ChromeOptions co= new ChromeOptions();
        co.addArguments("--remote-allow-origin=*");
        WebDriver driver= new ChromeDriver(co);
        driver.get("https://www.google.com/");
//        driver.manage().timeouts().implicitlyWait(30,"TimeUnit.SECONDS");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnI']")).click();
        String url= driver.getCurrentUrl();
        System.out.println(url);
        try {
        	Assert.assertEquals("https://doodles.google/", url);
        }catch (Exception e)
        {
        	e.printStackTrace();
        }
        System.out.println("Complete");
    }
}
