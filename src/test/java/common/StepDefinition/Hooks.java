package common.StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.example.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {


    @Before
    public void BeforeSteps() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sonam.Pal\\softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriverManager.driver = new ChromeDriver();
        WebDriverManager.driver.manage().window().maximize();
    }

    @After
    public void AfterSteps(Scenario scenario) {
        if(scenario.isFailed()) {
            System.out.println(scenario.getSourceTagNames());
        }
        WebDriverManager.driver.quit();

    }

}
