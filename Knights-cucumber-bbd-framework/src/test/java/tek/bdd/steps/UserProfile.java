package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.utility.SeleniumUtility;

import java.time.Duration;

public class UserProfile extends SeleniumUtility {
    @When("Open Browser")
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://dev.insurance.tekschool-students.com/login");

    }

    @When("Send username {string} and password {string}")
    public void sendingCredential(String username, String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys(password);
    }

    @When("click on SignIn button")
    public void clickOnSignIn() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
                ("//*[@id=\"root\"]/div/div[2]/div/div/div/div/form/div/div[3]/button[1]"))).click();
    Thread.sleep(2000);
    }
    @Then("click on Profile")
    public void clickOnProfile() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
                ("//*[@id=\"root\"]/div/div[1]/div/button"))).click();
        Thread.sleep(2000);
    }
//    @Then("validate information Profile Side Drawer is {string}")
//    public void validateInformationOfProfile(String expectedCondition) {
//        try {
//            driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:r8:\"]"));
//            System.out.println("Elements are exist and correct");
//        }
//        catch(NoSuchElementException e){
//            System.out.println("Element not exist and not correct");
//
//        }
@Then("click on Logout button")
public void logoutButton() throws InterruptedException {
   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
   wait.until(ExpectedConditions.visibilityOfElementLocated
           (By.xpath("//*[@id=\"chakra-modal-:r1e:\"]/footer/div/button[1]"))).click();
   Thread.sleep(500);
}

    @Then("clos browser")
    public void clos_browser() {
     driverQuit();
    }
}
