package firstpage;
import io.cucumber.testng.AbstractTestNGCucumberTests; 
import io.cucumber.testng.CucumberOptions;
    
@CucumberOptions(tags = "", features = {"src/test/resources/feature/l.feature"}, glue = {"firstpage"},
                 plugin = {"pretty","json:target/cucumber-reports/cucumber.json","html:target/cucumber-report/cucumber.html"})


public class runningpage extends AbstractTestNGCucumberTests {

}
