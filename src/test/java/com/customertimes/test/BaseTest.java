package com.customertimes.test;


import com.customertimes.test.framework.driver.WebdriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
 //   protected WebDriver driver;

    @BeforeSuite
    public void setup() throws InterruptedException {
//      driver = WebdriverRunner.getWebDriver();
        System.out.println("This is before suite");
    }

    @AfterSuite
    public void tearDown () {
        WebdriverRunner.closeWebDriver();
        System.out.println("This is after suite");
    }


    @BeforeClass
    public void beforeClassInTheBaseTest() {
        System.out.println("This is before class in the Base Test class");
    }
}
