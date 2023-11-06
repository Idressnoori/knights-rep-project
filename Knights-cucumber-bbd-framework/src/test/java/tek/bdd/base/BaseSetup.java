package tek.bdd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseSetup {
    protected static WebDriver driver;
    private final String App_URL = "https://dev.insurance.tekschool-students.com/";
//FINAL VARIABLE MEANS it can be assigned only one and can not change after.
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get(App_URL);
    }
    public void driverQuit() {
        if (driver != null)
            driver.quit();
    }
    public WebDriver getDriver(){return driver;}
}
