package skeletons;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:src/cucumbers-reports"}, features="src/test/resources/skeletons/shock.feature",
tags= {"not @tag1","@tag2"})
public class RunCucumber {

}
