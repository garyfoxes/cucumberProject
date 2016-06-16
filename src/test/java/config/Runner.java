package config; /**
 * Created by gfox on 15/06/2016.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources",
        glue = "config",
        format = {"html:output"})
public class Runner extends AbstractTestNGCucumberTests {
}
