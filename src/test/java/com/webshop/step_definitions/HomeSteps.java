package com.webshop.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.*;

public class HomeSteps {

    private WebDriver driver;
    private final String HOME_URL = "https://webshop-agil-testautomatiserare.netlify.app";

    @Before
    public void setup() {
        driver = new FirefoxDriver();
    }

    @After
    public void close() {
        driver.quit();
    }

    @Given("I visit the home page")
    public void i_visit_the_home_page() {
        driver.get(HOME_URL);
    }

    @Then("I should see the page title {string}")
    public void i_should_see_the_page_title(String expectedTitle) {
        assertEquals(expectedTitle, driver.getTitle(),
                "Page title is incorrect!");
    }
}
