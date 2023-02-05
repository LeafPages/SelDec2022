package testcases;

import base.BaseClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/features/Login.feature",
				glue = "pages",
				monochrome = true)
public class CucumberRunner extends BaseClass{

}
