package Cucumber.Pages.Google;

import Cucumber.Pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Ruslan Shevchenko on 26.02.2016.
 */
public class HomePage extends BasePage {

    public HomePage()
    {
        init();
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"lst-ib\"]")
    private WebElement searchInput;

    @FindBy(how = How.XPATH, using = "//*[@id=\"sblsbb\"]/button/span")
    private WebElement searchBtn;


    public void setSearchInput(String searchText) {
        this.searchInput.sendKeys(searchText);
    }

    public void clickSearchBtn() {
        this.searchBtn.click();
    }
}
