package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\kavit\\Documents\\Workspace\\Demoshop\\src\\main\\java\\Feature"
		,glue={"StepDefinition"}
		,format= {"pretty","html:test-output"}
		)
public class DemoShopRunner {

}
