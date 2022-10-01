package StepDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/Features/Login.feature",
glue={"StepDefinition"},monochrome= true,
plugin = {"json","html:target/JSONReports"}
)
public class TestSuiteRunner {
	

}
