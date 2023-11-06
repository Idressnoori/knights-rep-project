package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.utility.SeleniumUtility;

import java.time.Duration;

import static java.sql.DriverManager.getDriver;

public class CommonSteps extends SeleniumUtility {

    @Given("Open browser and navigate")
    public void openBrowserAndNavigate() {
    openBrowser();

    }
    @Then("validate application title should be {string}")
    public void validateApplicationTitle(String expectedAppTitle) {
    String actualAppTitle = getDriver().getTitle();
    Assert.assertEquals("add primary account", expectedAppTitle, actualAppTitle);
    }

    @Then("close browser")
    public void closeBrowser(){

    }



}
