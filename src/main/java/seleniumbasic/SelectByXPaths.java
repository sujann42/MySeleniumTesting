package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelectByXPaths {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/suzan/Documents/CHROME_DRIVER/chromedriver");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.w3schools.com/");
        //driver.get("https://www.google.com/");
        driver.get("https://www.amazon.com/");
        //driver.manage().window().maximize();


        //By Link Text
        ////driver.findElement(By.linkText("Learn Bootstrap")).click();

        //driver.findElement(By.xpath("//*[@id='mysideNav']/div/a[text() = 'Learn CSS']")).click();
        //driver.findElement(By.xpath("//*[@id='gb_70']")).click();
        //driver.findElement(By.xpath("/a[starts-with(@id, 'gb_7')]")).click(); /*Should be 1st element*/
        //driver.findElement(By.xpath("//a[starts-with(@id, 'gb_7')]")).click(); /*It can be anywhere*/
        //driver.findElement(By.xpath("//a[contains(@id, 'b_7')]")).click(); //If if contains that
        //driver.findElement(By.xpath("//*[@id=\"mySidenav\"]/div/a[starts-with(text(), 'Learn Boots')]")).click();
        //driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/a[last()]")).click(); /*Find the last link*/
        //driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/a[last()-1]")).click(); /*Find the 2nd last link*/
        //driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/a[position()=1]")).click(); /*Find the last link*/
        //driver.findElement(By.xpath("//*[@id=\"mySidenav\"]/div/a[starts-with(text(), 'C++ Exercises')]")).click();
        //driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Study Table");
        //driver.findElement(By.xpath("div[id='NyxC5UTy7D73b6Wpn5WVHA']/div[3]/a")).click();

    }
}
