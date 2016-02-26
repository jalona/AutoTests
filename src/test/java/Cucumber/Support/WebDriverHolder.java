package Cucumber.Support;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ruslan Shevchenko on 26.02.2016.
 */
public class WebDriverHolder {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            try {
                driver = BrowserFactory.getDriver();
                driver.manage().deleteAllCookies();

                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
                driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
            } finally {
                Runtime.getRuntime().addShutdownHook(
                        new Thread(new BrowserCleanup()));
            }
        }
        return driver;
    }

    private static class BrowserCleanup implements Runnable {
        public void run() {
            close();
        }

    }

    public static synchronized void close() {
        if (driver != null) {
            getDriver().quit();
            driver = null;
        }
    }

}
