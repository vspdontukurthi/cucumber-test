package feature.book;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty" ,"json:target/bookserarch_test_cucumber.json"}) 
public class BookSearchTest {
}