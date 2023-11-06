package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.utility.SeleniumUtility;

import java.time.Duration;

public class Plans extends SeleniumUtility {

    @When("Enter username {string} and password {string}")
    public void sendingCredential(String username, String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys(password);
    }
    @When("click on Sign in button")
    public void click_on_sign_in_button() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
                ("//*[@id=\"root\"]/div/div[2]/div/div/div/div/form/div/div[3]/button[1]"))).click();
        Thread.sleep(2000);
    }
    @Then("click on plan")
    public void click_on_plan() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
                ("//*[@id=\"root\"]/div/div[2]/div/div/a[3]"))).click();
        Thread.sleep(2000);
    }
    @Then("validate the contents of the plan sections")
    public boolean validate_the_contents_of_the_plan_sections() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div")));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
