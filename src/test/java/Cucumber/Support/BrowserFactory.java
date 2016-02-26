package Cucumber.Support;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.io.*;
import java.net.URL;
import java.util.Properties;

/**
 * Created by Ruslan Shevchenko on 26.02.2016.
 */
public class BrowserFactory {

    private BrowserFactory() {
    }

    public static WebDriver getDriver()  {
            return new FirefoxDriver();
    }
}