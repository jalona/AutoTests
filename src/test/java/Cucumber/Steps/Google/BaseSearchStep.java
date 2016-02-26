package Cucumber.Steps.Google;

import Cucumber.Pages.Google.HomePage;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Пусть;
import cucumber.api.java.ru.Тогда;

/**
 * Created by Ruslan Shevchenko on 26.02.2016.
 */
public class BaseSearchStep {

    HomePage homePage = new HomePage();

    @Пусть("^открыт сайт (\\S+)$")
    public void openSite(String URL){
        homePage.open(URL);
    }

    @И("^введен поисковой запрос (\\S+)$")
    public void setSearchText(String searchText){
        homePage.setSearchInput(searchText);
    }

    @И("нажать кнопку поиска")
    public void clickSearchBtn(){
        homePage.clickSearchBtn();
    }

    @Тогда("открывается страница результатов")
    public void seeResult(){
        //
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
