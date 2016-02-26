package Cucumber.Support;

import org.openqa.selenium.WebElement;

/**
 * Created by Ruslan Shevchenko on 26.02.2016.
 */
public class WebDriverUtils {

    public void switchToIFrame(WebElement iFrame) {
        WebDriverHolder.getDriver().switchTo().frame(iFrame);
    }

    public void switchToDefaultContent() {
        WebDriverHolder.getDriver().switchTo().defaultContent();
    }
}
