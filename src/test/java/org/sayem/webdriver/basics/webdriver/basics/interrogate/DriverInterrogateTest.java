package org.sayem.webdriver.basics.webdriver.basics.interrogate;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.sayem.webdriver.basics.webdriver.examples.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DriverInterrogateTest {

    @Test
    public void driverLevelPageInterrogateMethods() {

        WebDriver driver;

        final String theTestPageURL =
                "http://www.compendiumdev.co.uk/selenium/basic_web_page.html";

        driver = Driver.get();

        driver.navigate().to(theTestPageURL);

        assertEquals(driver.getTitle(), "Basic Web Page Title");
        assertEquals(driver.getCurrentUrl(), theTestPageURL);

        String pageSource = driver.getPageSource();
        assertTrue(pageSource.contains("A paragraph of text"));

        System.out.println(pageSource);

    }

}
