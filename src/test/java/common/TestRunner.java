package common;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/Login.feature",
        glue = {"common.StepDefinition","Hooks"},
        tags = "@smoke",
        plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","json:target/cucumber.json"},
        monochrome = true
)

public class TestRunner {
}
