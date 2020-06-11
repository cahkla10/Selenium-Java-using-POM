package setups;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup extends DriverPool {
    ChromeDriver driver;

    protected void startDriver() {
        System.setProperty("webdriver.chrome.driver","/Users/itworker/Documents/GITHUB/Selenium-Java-using-POM/src/test/resources/chromedriver");
        driver = new ChromeDriver();
        setDriverInstance(driver);
        System.out.println("Driver: " + driver);
    }

    protected void stopDriver() {
        driver.close();
    }
}