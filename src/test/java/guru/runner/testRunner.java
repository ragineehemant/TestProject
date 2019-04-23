package guru.runner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions( //Test.Automation\src\test\java\TestAutomation\TestFeature
	features = "src/test/java/guru/features",
		plugin = { "pretty", "json:target/cucumber.json" },
		glue = { "guru.step" },
        tags= {"@run234"})


public class testRunner {

}



