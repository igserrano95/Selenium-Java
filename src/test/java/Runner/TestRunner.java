package Runner;

import Pages.BasePage;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "Steps",
        plugin = {"pretty", "html:target/cucumber-reports"})

public class TestRunner {

    @AfterClass
    public static void cleanDriver() {
        BasePage.closeBrowser();
    }
}
