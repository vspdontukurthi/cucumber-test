package feature.salary;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//test for salary
@RunWith(Cucumber.class)
@CucumberOptions(strict = false, features = "features/salary", format = { "pretty",
"json:target/cucumber.json" }, tags = { "~@ignore" })
public class SalaryTest {

}
