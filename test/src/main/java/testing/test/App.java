package testing.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-orgins-*");
        WebDriver driver=new ChromeDriver(co);
        driver.get("https://www.google.com");
        
    }
}
