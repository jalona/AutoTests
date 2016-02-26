package Cucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Created by Ruslan Shevchenko on 26.02.2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Cucumber/Features/"},
        format = {"pretty", "html:target/cucumber.html"},
        tags = {"@run"}
)
public class CucumberRunner {
}
