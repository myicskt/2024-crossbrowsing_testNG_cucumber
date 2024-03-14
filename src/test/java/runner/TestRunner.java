package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= "src/test/resources/features/myfeature.feature",
		glue="step_definations",
		monochrome=true,
		dryRun=false,
	    plugin = {
	    		"pretty", 
	    		"html:target/cucumber-reports"} // Optionally, you can specify plugins for reporting

		
		
		
		
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
