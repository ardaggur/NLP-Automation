package Run;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


//if we need to generate reports, we use plugin, in order to make them colored
//we use pretty keyword, then after we specify type and the location of the target report
//bu raporu html disinda, json report veya xml report formatında da olusturabılıyoruz)



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
        glue = "StepDefinition",
        plugin = {"pretty","json:target/cucumber.json"})



public class CucumberTestRunner {


}
