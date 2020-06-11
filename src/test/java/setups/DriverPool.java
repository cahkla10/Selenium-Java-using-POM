package setups;

import org.openqa.selenium.WebDriver;

public class DriverPool {

    private static WebDriver driverInstance;

    public static WebDriver getDriverInstance() {

        return DriverPool.driverInstance;
    }

    public void setDriverInstance(WebDriver instance) {

        DriverPool.driverInstance = instance;
    }
}