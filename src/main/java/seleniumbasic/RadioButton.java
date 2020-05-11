package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/suzan/Documents/CHROME_DRIVER/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //Thread.sleep(3000);
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ram");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Thapa");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Thapa@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Thapa@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Thapa");
        //driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("mypass");
        //driver.findElement(By.name("reg_email__")).sendKeys("");
        //driver.findElement(By.name("reg_password__"));

        //List<WebElement> list = driver.findElements(By.className());

        //driver.close(); //closes the current browser.
        //driver.quit(); //terminates the driver
    }
}
