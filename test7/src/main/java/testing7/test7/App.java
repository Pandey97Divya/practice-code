package testing7.test7;

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
        driver.get("https://demo.applitools.com/index.html");
        driver.findElement(By.xpath("/html/body/div/div/form/div[1]/input")).sendKeys("abcde");
        driver.findElement(By.xpath("/html/body/div/div/form/div[2]/input")).sendKeys("Divi@123");
        driver.findElement(By.xpath("/html/body/div/div/form/div[3]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div[1]/div[1]/a[1]/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div[1]/div[1]/a[2]/span")).click();
    }
    
}
