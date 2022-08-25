package steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "feature", glue = "steps", plugin = { "pretty",
"json:target/report/json/output.json", "html:target/report/html" }
, tags={"@login"}
)

public class Runner {

}
