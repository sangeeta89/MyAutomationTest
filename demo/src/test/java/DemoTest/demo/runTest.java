package DemoTest.demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 

@RunWith(Cucumber.class) 
@CucumberOptions( 
		features="D:\\Codoid\\demo\\Features\\CucHtml.feature",
		glue="D:\\Codoid\\demo\\src\\test\\java\\DemoTest\\demo\\Cucum_report_stepdef.java",
		format = {"pretty", "html:D:/Codoid/demo/src/test/java/DemoTest/demo/target/Destination"} ) 
public class runTest {

}
