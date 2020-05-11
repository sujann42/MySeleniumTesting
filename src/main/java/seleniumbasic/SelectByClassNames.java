package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class SelectByClassNames {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/suzan/Documents/CHROME_DRIVER/chromedriver");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.w3schools.com/");
        //driver.get("https://www.google.com/");
        driver.get("https://www.amazon.com/");
        //driver.manage().window().maximize();

        List<WebElement> listofbuttons = driver.findElements(By.className("btn"));
        for (int i = 0; i < listofbuttons.size(); i++) {
            System.out.println(listofbuttons.get(i));
            if (listofbuttons.get(i).equals("JQuery Tutorial")) {
                listofbuttons.get(i).click();
                break;
            }

        }
    }
}
