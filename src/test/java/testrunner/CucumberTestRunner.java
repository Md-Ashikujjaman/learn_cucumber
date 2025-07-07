package testrunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/feature/Login.feature",
        glue = "step_defination"
)

public class CucumberTestRunner extends AbstractTestNGCucumberTests {



}
