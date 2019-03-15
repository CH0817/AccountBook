package tw.com.rex.accountbook;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber", "junit:target/junit-report.xml"},
                 features = {"src/test/resources/features"})
public class FeatureTestRunner {}
