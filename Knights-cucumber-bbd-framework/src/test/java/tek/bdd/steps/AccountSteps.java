package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.utility.SeleniumUtility;

import java.time.Duration;

public class AccountSteps extends SeleniumUtility {

    @When("Navigate to Home page then click on Create Primary Account Button")
    public void click_on_create_primary_account_button() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath
                ("//*[@id=\"root\"]/div/div[2]/div/div/a"))).click();
    }
    @Then("validate page title should be {string}")
    public void pageTitle(String expectedPageTitle) {
        String actualPageTitle = getDriver().getTitle();
        Assert.assertEquals("Create Primary Account Holder", expectedPageTitle, actualPageTitle);

    }
    @When("enter email address as {string}")
    public void emailAddress(String email) {
        By emailLocator = By.name("email");
        WebElement emailElement = driver.findElement(emailLocator);
        emailElement.sendKeys("idress.noori123@yahoo.com");
    }
    @Then("DropDown and select {string}")
    public void title(String title){
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    By titleLocator = By.id("title");
    WebElement titleElement= wait.until(ExpectedConditions.visibilityOfElementLocated(titleLocator));
    Select titleSelect = new Select(titleElement);
    titleSelect.selectByVisibleText("Mr.");
    }
    @When("Enter firstname as {string}")
    public void firstname(String firstname) {
        By nameLocator = By.name("firstName");
        WebElement nameElement = driver.findElement(nameLocator);
        nameElement.sendKeys("Idress");
    }
    @Then("Enter lastname as {string}")
    public void lastname(String lastname) {
        By nameLocator = By.name("lastName");
        WebElement nameElement = driver.findElement(nameLocator);
        nameElement.sendKeys("Noori");
    }
    @Then("Select Gender as {string}")
    public void gender(String gender){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        By genderLocator = By.id("gender");
        WebElement genderElement= wait.until(ExpectedConditions.visibilityOfElementLocated(genderLocator));
        Select genderSelect = new Select(genderElement);
        genderSelect.selectByVisibleText("Male");
    }

    @Then("select Marital Status as {string}")
    public void maritalStatus(String maritalStatus){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        By maritalStatusLocator = By.id("maritalStatus");
        WebElement maritalStatusElement= wait.until(ExpectedConditions.visibilityOfElementLocated(maritalStatusLocator));
        Select maritalStatusSelect = new Select(maritalStatusElement);
        maritalStatusSelect.selectByVisibleText("Married");
    }
    @Then("Enter Employment Status as {string}")
    public void name(String employmentStatus) {
        By nameLocator = By.name("employmentStatus");
        WebElement nameElement = driver.findElement(nameLocator);
        nameElement.sendKeys("Student");
    }
    @Then("Enter date of birth {string}")
    public void id(String dateOfBirth) {
        By idLocator = By.id("dateOfBirth");
        WebElement idElement = driver.findElement(idLocator);
        idElement.sendKeys("09/07/1993");
    }
    @Then("click on Create Account button")
    public void createAccountButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath
                ("//*[@id=\"root\"]/div/div[2]/div/div/div/form/div/div[2]/button[1]"))).click();
    }
    @Then("enter the username {string} password {string} and confirm the password {string}")
    public void enterUsernameAndPassWord(String username, String password, String confirmPassword) {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys(username);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys(password);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirm"))).sendKeys(confirmPassword);
    }

@Then("click on submit button")
public void submitButton() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
    wait.until(ExpectedConditions.elementToBeClickable
            (By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/form/div/div[4]/button[1]"))).click();
}
    @Then("validate error message as expected")
    public void errorMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.
                xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/form/div[1]")));
        String expectedErrorMessage = "Account with email idress.noori123@yahoo.com is exist";
        System.out.println(expectedErrorMessage);

    }

}