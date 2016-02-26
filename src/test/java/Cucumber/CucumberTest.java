package Cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Ruslan Shevchenko on 26.02.2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Cucumber/Features/"},
        monochrome = true,
        format = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/report.json"}
)
public class CucumberTest {

}