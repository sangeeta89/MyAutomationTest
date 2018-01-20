package DemoTest.demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Codoid\\demo\\Features\\Amazondemo.feature",
				glue="D:\\Codoid\\demo\\src\\test\\java\\DemoTest\\demo\\Amazon_stepdef.java"				
		)
public class RunnerAmazon {

}
