package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingNG {

    @Test
    public void test(){
        System.out.println("Inside test 1");
    }
    @Test
    public void test2(){
        System.out.println("Inside test 2");
    }

    @BeforeMethod
    public void openBrowser(){

    }

    public void close(){

    }

}
