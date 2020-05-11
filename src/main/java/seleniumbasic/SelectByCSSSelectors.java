package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelectByCSSSelectors {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/suzan/Documents/CHROME_DRIVER/chromedriver");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.w3schools.com/");
        //driver.get("https://www.google.com/");
        driver.get("https://www.amazon.com/");

        //driver.manage().window().maximize();

        /*By CSS Selector*/
        //driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("Study Table");
        //driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
        //driver.findElement(By.cssSelector("div[id^='123']")); //Starts with
        //driver.findElement(By.cssSelector("div[id$='456']")); //Ends with
        //driver.findElement(By.cssSelector("ul#fruit li:nth-of-type(2)")); //nth child
        //driver.findElement(By.cssSelector("ul#fruit li:last-child")); //last child
        //driver.findElement(By.cssSelector("div#nav-tools a#nav-orders span.nav-line-2")).click();

    }
}
