package TestRunnerBackground;


import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureBaclground",
glue="TestRunnerBackground",
monochrome=true,
plugin={"pretty","html:target/HtmlReports/report.html","json:target/JsonReports/report1.json","junit:target/JunitReports/junitreport.xml"}
)

public class TestRunnerBackgroundDemo {

}
