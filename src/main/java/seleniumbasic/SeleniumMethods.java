package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/suzan/Documents/CHROME_DRIVER/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //Thread.sleep(3000);
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.close(); //closes the current browser.
        driver.quit(); //terminates the driver
    }
}
