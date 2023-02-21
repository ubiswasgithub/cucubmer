package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(publish = true, features = "src/test/resources/features", glue = { "steps" }, tags = "@doc", plugin = {
		"pretty", "html:target/cucumber-report/cucumber.html" })
public class TestRunnerDocTableOutLine {

}
