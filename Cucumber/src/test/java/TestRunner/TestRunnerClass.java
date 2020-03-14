package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="com.stepdefinition",monochrome=true,
plugin={"html:C:\\Users\\kanagaj\\eclipse-workspace\\Cucumber\\report","json:C:\\Users\\kanagaj\\eclipse-workspace\\Cucumber\\report\\output.json"})
public class TestRunnerClass {


}

