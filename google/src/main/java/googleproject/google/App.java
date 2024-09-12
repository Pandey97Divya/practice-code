package googleproject.google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        co.addArguments("--remote-allow-origin");
        WebDriver driver= new ChromeDriver(co);
        driver.get("https://www.google.com/");
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//div[@jscontroller='unV4T' and @jsname='F7uqIe' and @class='XDyW0e' and @role='button']\r\n")).click();
        driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys("naukri");
        driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys(Keys.ENTER);
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/nlogin/login?utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMIq9GA-c77hwMVjqhmAh0HORYUEAAYASAAEgIkdPD_BwE&gclsrc=aw.ds");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[@id=\"usernameField\"]")).sendKeys("pandey97divya@gmail.com");
        driver.findElement(By.xpath("//input[@id=\"passwordField\"]")).sendKeys("Divi1437");
        driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()=\"View\"]")).click();
        Thread.sleep(5000);
        String str= driver.findElement(By.xpath("//span[text()=\"Divya Pandey\"]")).getText();
        String str1= driver.findElement(By.xpath("//span[text()=\"8375807712\"]")).getText();
        String str2= driver.findElement(By.xpath("//span[text()=\"pandey97divya@gmail.com\"]")).getText();
        String str3= driver.findElement(By.xpath("//span[@title=\"4 Year(s) 2 Month(s)\"]")).getText();
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
//        driver.findElement(By.xpath("//span[text()=\"Naukri.com - Quick Job Apply | Register Now - Naukri.com\"]")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();
//        driver.manage().window().minimize();
//        driver.findElement(By.xpath("//button[@aria-label=\"Stay signed out\"]")).click();
//        driver.findElement(By.xpath("//input[@data-ved=\"0ahUKEwjjpr3zn_KHAxV1qVYBHZGNBu8Q4dUDCB8\"]")).click();
    }
}
