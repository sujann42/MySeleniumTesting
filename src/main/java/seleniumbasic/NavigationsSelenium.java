package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationsSelenium {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/****/Documents/CHROME_DRIVER/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("aaa@YMAIL.COM");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("sssss");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
        Thread.sleep(6000);
        driver.close();
        driver.quit();

    }
}
