package abc.tt.runners;

import java.io.File;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resource/FeatureFiles" }, glue = { "abc.tt.chase.stepDef",
		        "abc.tt.utilities" }, tags = { "@regression" }, plugin = { "pretty", "html:target/cucumber-htmlreport",
				"json:target/JasonReport/cucumber-report.json","com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/cucumber-ExtentReport.html" },
		        monochrome = true)

public class RunnerClass extends AbstractTestNGCucumberTests {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("config/config.xml"));
	
	}

}