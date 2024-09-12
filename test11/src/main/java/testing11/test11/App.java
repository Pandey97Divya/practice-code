package testing11.test11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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
       driver.get("https://demo.applitools.com/");
       Thread.sleep(5000);
       driver.findElement(By.id("username")).sendKeys("Testing123");
       Thread.sleep(5000);
       driver.findElement(By.id("password")).sendKeys("Test@123");
       Thread.sleep(5000);
       driver.findElement(By.id("log-in")).click();
    }
}
