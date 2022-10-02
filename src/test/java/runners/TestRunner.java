package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import utilities.Driver;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "rerun:target/failed_scenarios.txt"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@urlTestGoogle"
        //dryRun = true// tanimsiz adim var mi? Var ise: Adimlari gosteriyo
)

public class TestRunner {
}