package Cucumber.Steps.Google;

import Cucumber.Pages.Google.HomePage;
import Cucumber.Steps.BaseStep;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Пусть;
import cucumber.api.java.ru.Тогда;
import ru.yandex.qatools.allure.annotations.*;
import ru.yandex.qatools.allure.model.SeverityLevel;

/**
 * Created by Ruslan Shevchenko on 26.02.2016.
 */
@Title("This is our cool test suite")
@Description("In this cool suite we will test only cool features")
public class BaseSearchStep extends BaseStep {

    HomePage homePage = new HomePage();

    @Severity(SeverityLevel.CRITICAL)
    @Issues({
            @Issue("MYISSUE-1"),
            @Issue("MYISSUE-2")
    })
    @TestCaseId("TMS-1")
    @Пусть("^открыт сайт (\\S+)$")
    public void openSite(String URL){
        homePage.open(URL);
        attach();
    }

    @И("^введен поисковой запрос (\\S+)$")
    public void setSearchText(String searchText){
        homePage.setSearchInput(searchText);
        attach();
    }

    @И("нажать кнопку поиска")
    public void clickSearchBtn(){
        homePage.clickSearchBtn();
        attach();
    }

    @Тогда("открывается страница результатов")
    public void seeResult(){
        homePage.pause(5);
        attach();
    }

}
