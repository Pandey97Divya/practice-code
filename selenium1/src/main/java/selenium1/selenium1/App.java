package selenium1.selenium1;

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
        co.addArguments("--remote-allow-origin=*");
        WebDriver driver= new ChromeDriver(co);
        driver.get("https://www.google.com/");
        Thread.sleep(5000);
//        driver.findElement(By.xpath("//input[@data-ved=\"0ahUKEwixwIvgxPuHAxUgj68BHYXHJBwQ19QECCA\"]")).click();
       // driver.findElement(By.name("btnI")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("input[data-ved=\\\"0ahUKEwixwIvgxPuHAxUgj68BHYXHJBwQ19QECCA\"]"));
    }
}
