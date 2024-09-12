package testing2.test2;

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
        ChromeOptions ab= new ChromeOptions();
        ab.addArguments("--remote-allow-origin=*");
        WebDriver driver= new ChromeDriver(ab);
        driver.get("https://www.google.com");
    }
}
