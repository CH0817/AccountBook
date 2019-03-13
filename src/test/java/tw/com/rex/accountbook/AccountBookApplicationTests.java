package tw.com.rex.accountbook;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//使用 Cucumber 測試
@RunWith(Cucumber.class)
// glue: 指定 feature 文件位置
// features: 指定 test class package
@CucumberOptions(glue = {"tw.com.rex.accountbook"}, features = {"src/test/resources/features"})
public class AccountBookApplicationTests {}

