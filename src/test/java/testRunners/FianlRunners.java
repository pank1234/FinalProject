package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Final.Feature",
                 glue={"stepdefinitions"},
                 tags= {"@Final001"},
	 plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/reportfolder/reportfile.html"})
	 





public class FianlRunners {

}
