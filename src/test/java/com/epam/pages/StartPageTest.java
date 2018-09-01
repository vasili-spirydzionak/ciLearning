package com.epam.pages;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class StartPageTest {

    StartPage startPage = new StartPage();

    @Given("^user is on a start page$")
    public void openStartPage() {
        startPage.openPage();
    }


    @When("^user enters iphone$")
    public void enterSearchItems() {
        startPage.enterText("iphone10");
    }

    @Then("^.* is shown$")
    public void verifySearchResult() {
        startPage.submitSearch();
    }
    @After
    public void closeDriver(){
        startPage.getInstance().close();
    }
}
