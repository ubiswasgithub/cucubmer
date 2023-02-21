package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = { "steps", "testrunner" }, tags = "@logout")

public class TestNgRunner extends AbstractTestNGCucumberTests {

}
