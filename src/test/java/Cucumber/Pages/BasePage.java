package Cucumber.Pages;

import Cucumber.Support.WebDriverHolder;
import Cucumber.Support.WebElementWait;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Ruslan Shevchenko on 26.02.2016.
 */
public abstract class BasePage {
    public WebElementWait wait=new WebElementWait();

    public BasePage() {
        init();
    }

    public void init() {
        PageFactory.initElements(WebDriverHolder.getDriver(), this);
    }

    public void open(String URL)
    {
        WebDriverHolder.getDriver().get(URL);
        WebDriverHolder.getDriver().manage().window().maximize();
    }

    public String getCurrentPageUrl() {
        return WebDriverHolder.getDriver().getCurrentUrl();
    }

    public String getCurrentPageTitle() {
        return WebDriverHolder.getDriver().getTitle();
    }

    public void refresh() {
        WebDriverHolder.getDriver().navigate().refresh();
    }
}
