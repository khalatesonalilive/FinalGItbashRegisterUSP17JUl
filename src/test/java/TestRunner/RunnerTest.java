
package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"AllFeatureFiles"},
		
		glue= {"Steps"},
		
		dryRun=false,
		
		monochrome=true
		
		

		)

public class RunnerTest extends AbstractTestNGCucumberTests{

}
