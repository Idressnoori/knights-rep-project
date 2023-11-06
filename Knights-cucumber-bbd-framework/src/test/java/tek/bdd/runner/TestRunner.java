package tek.bdd.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:feature",
        glue = "tek.bdd.steps",
        tags = "@Smoke",
        plugin = {
                "html:target/html_report.html"
        }
)
public class TestRunner {
}
