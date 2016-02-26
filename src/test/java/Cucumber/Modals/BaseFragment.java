package Cucumber.Modals;

import Cucumber.Support.WebDriverHolder;
import Cucumber.Support.WebDriverUtils;
import Cucumber.Support.WebElementWait;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Ruslan Shevchenko on 26.02.2016.
 */
public abstract class BaseFragment {

    public BaseFragment() {
        initFragment();

    }
    public WebElementWait wait = new WebElementWait();
    public WebDriverUtils utils = new WebDriverUtils();
    public void initFragment() {
        PageFactory.initElements(WebDriverHolder.getDriver(), this);
    }

}
