package common.StepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.WebDriverManager;
import org.openqa.selenium.By;


public class Login {


    @Given("user navigates to login page")
    public void userNavigatesToLoginPage() {
        WebDriverManager.driver.get(WebDriverManager.baseURL);

    }

    @When("user enters correct credentials")
    public void userEntersCorrectUsernameANDPasswordValues() {
        WebDriverManager.driver.findElement(By.id("username")).sendKeys("student");
        WebDriverManager.driver.findElement(By.id("pass")).sendKeys("Password123");
        WebDriverManager.driver.findElement(By.id("submit")).click();
    }

    @Then("user is directed to the homepage")
    public void userIsDirectedToTheHomepage() {
       
    }



}
