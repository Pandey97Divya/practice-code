package testing9.test9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Projectpractice1.projectdemo.StringFiles;

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
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(5000);
        //driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("standard_user");
        //driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //driver.findElement(By.name("user-name")).sendKeys("standard_user");
        //driver.findElement(By.className("error")).sendKeys("standard_user");
        //driver.findElement(By.tagName("input")).sendKeys("standard_user");
        //driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
        //driver.findElement(By.cssSelector("input.error")).sendKeys("standard_user");
        //driver.findElement(By.cssSelector("input[placeholder=\"Username\"]")).sendKeys("standard_user");
        //driver.findElement(By.cssSelector("input[data-test=\"password\"]")).sendKeys("standard_user");
        //driver.findElement(By.xpath("//*[@placeholder=\"Username\"]")).sendKeys("standard_user");
        //driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@placeholder=\"Username\"][@id=\"user-name\"]")).sendKeys("standard_user");
        //driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys("secret_sauce");
        //driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
//        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
//        driver.findElement(By.id("login-button")).click();
//        driver.navigate().back();
//        driver.navigate().refresh();
//        Thread.sleep(5000);
       
        
        
    }
}
