package selemiumprac2.seleniumprac;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

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
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String parent=driver.getWindowHandle();

        Set<String>s=driver.getWindowHandles();
        	System.out.println(parent);
        	System.out.println(s.size());
//        driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Harsh");
//        driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Kumar");
//        driver.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys("hk10539@gmail.com");
//        driver.findElement(By.xpath("//label[@for=\"gender-radio-1\"]")).click();
//        driver.findElement(By.xpath("//input[@id=\"userNumber\"]")).sendKeys("9548184214");
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//input[@id=\"dateOfBirthInput\"]")).click();
//        Thread.sleep(5000);
//        Select s1= new Select(driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]")));
//        s1.selectByVisibleText("December");
//        Thread.sleep(5000);
//        Select s= new Select(driver.findElement(By.xpath("//select[@class=\"react-datepicker__year-select\"]")));
//        s.selectByVisibleText("1997");
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//*[text()=\"10\"]")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[6]/div[2]/div/div/div[1]")).sendKeys("Automation");
//        Thread.sleep(5000);
//        List<WebElement> l=driver.findElements(By.xpath("//label[@class=\"custom-control-label\"]"));
//        l.get(3).click();
//        l.get(4).click();
//        l.get(5).click();
//        
        }
}
