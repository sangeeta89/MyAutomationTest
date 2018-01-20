package DemoTest.demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Codoid\\demo\\Features\\Demo.feature",
				glue="D:\\Codoid\\demo\\src\\test\\java\\DemoTest\\demo\\step_definition.java"				
		)

public class RunnerTest {
	
}
