package skeletons;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:src/cucumbers-reports","json:src/cucumber-reports/reports.json"},
features="src/test/resources/skeletons/shock.feature",dryRun=false,monochrome=true,tags= "@data")

public class RunCucumber {

}
