package Stepdefination_Hooks;



import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureHooks",
glue="Stepdefination_Hooks",
monochrome=true,
plugin={"pretty","html:target/HtmlReports/report.html","json:target/JsonReports/report1.json","junit:target/JunitReports/junitreport.xml"}
)

public class TestRunnerHooks {

}
