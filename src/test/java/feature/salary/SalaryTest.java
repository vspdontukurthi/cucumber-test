package feature.salary;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty" ,"json:target/salary_test_cucumber.json"}) 
public class SalaryTest {

}
