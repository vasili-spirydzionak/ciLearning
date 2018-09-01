package com.epam.pages;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\testResources\\features\\user_searches_iphone.feature",
                 glue = "com.epam.pages")
public class RunCukesTest {

}
