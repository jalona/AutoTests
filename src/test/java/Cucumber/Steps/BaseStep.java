package Cucumber.Steps;

import Cucumber.Support.AllureYandex;

/**
 * Created by Ruslan Shevchenko on 26.02.2016.
 */
public abstract class BaseStep {

    public void attach(){
        AllureYandex.makeScreenshotWindow("PNG Window_Screenshot");
        AllureYandex.makeScreenshotScreen("PNG Screen_Screenshot");
        AllureYandex.makeFile("this maybe log");
    }
}
