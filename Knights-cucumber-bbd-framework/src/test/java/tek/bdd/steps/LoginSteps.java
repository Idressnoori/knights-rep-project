package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.utility.SeleniumUtility;

import java.time.Duration;

public class LoginSteps extends SeleniumUtility {

    @When("navigate to the home page and open Browser")
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://dev.insurance.tekschool-students.com/login");

    }

    @When("sending username {string} and password {string}")
    public void sendingCredential(String username, String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys(password);
    }

    @When("click on Sign In button")
    public void clickOnSignIn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
                ("//*[@id=\"root\"]/div/div[2]/div/div/div/div/form/div/div[3]/button[1]"))).click();


    }

    @Then("Login Successfully")
    public void Login_Successfully() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.
                xpath("//*[@id=\"root\"]/div/div[1]/div/h2")));
        String expectedText = "Primary Account Portal";
        System.out.println(expectedText);
        Thread.sleep(3000);
    }

    @Then("close Browser")
    public void closeBrowser() {
        driver.quit();
    }
    @Then("validate the error message")
    public void errorMessage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.
                xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div")));
        String expectedErrorMessage = "User wrong not found";
        System.out.println(expectedErrorMessage);
        Thread.sleep(3000);
    }
}
