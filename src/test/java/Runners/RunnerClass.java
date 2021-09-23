package Runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        features = {"src/test/java/Features"},
        glue = {"StepDefinitions"},
        dryRun = false ,
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"}

)
public class RunnerClass extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void afterClass() {
        Reporter.loadXMLConfig("src/test/java/XMLFiles/ExtendReportSet.xml");

        Reporter.setSystemInfo("User Name", "Mesut Erbay");
        Reporter.setSystemInfo("Application Name", "Media Markt");
        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
        Reporter.setSystemInfo("Department", "QAr");

        Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
    }


}
