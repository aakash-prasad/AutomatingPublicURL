package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

// This is the main runner class for executing feature files
@CucumberOptions(
        features = "src/test/java/features", // 👈 correct relative path to feature files
        glue = {"stepdefinitions", "hooks"}, // 👈 packages where step defs and hooks exist
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        monochrome = true
)
public class UIRunner extends AbstractTestNGCucumberTests {

    // Enables parallel execution support in TestNG for Cucumber
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

