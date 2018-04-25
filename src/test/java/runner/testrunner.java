package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/java/features"
        ,glue= "seleniumgluecode",
        		format={"json:target/cucumber-reports/cucumber.json"}, 
        monochrome = true
                )

public class testrunner {
 //   @AfterClass
  //  public static void writeExtentReport() {
  //      Reporter.loadXMLConfig(new File("config/report.xml"));
    
  //  }
}