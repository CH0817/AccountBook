package tw.com.rex.accountbook;

import cucumber.api.java.Before;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
public class CucumberConfig {

    @Before
    public void setupCucumberSpringContext(){
        // Dummy method so cucumber will recognize this class as glue
        // and use its context configuration.
    }

}
