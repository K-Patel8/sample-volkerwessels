package com.localhost.steps;

import com.localhost.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/*
Created by : Kaushik Patel
*/
public class MyStepdefs {
    @Given("^user is on VolkerWessels main page$")
    public void userIsOnVolkerWesselsMainPage() {
    }

    @When("^user hovers mouse on WHAT WE DO tab and user click on Rail Infrastructure option$")
    public void userHoversMouseOnWHATWEDOTabAndUserClickOnRailInfrastructureOption() throws InterruptedException {
        new HomePage().userAcceptsAllCookies();
        new HomePage().mouseHoverOnWhatWeDoTab();
        Thread.sleep(2000);
        new HomePage().clickOnRailInfrastructureFromDropDown();
    }

    @Then("^user is successfully navigated to Rail Infrastructure project$")
    public void userIsSuccessfullyNavigatedToRailInfrastructureProject() {
        String expectedTextOnRailInfrastructurePage = "Rail infrastructure";
        Assert.assertEquals("User has not been directed to \"Rail Infrastructure", expectedTextOnRailInfrastructurePage, new HomePage().gettingTextForVerificationForNavigatedPage());
    }

    @When("^user hovers mouse on WHAT WE DO tab and checks how many tasks are there$")
    public void userHoversMouseOnWHATWEDOTabAndChecksHowManyTasksAreThere() {
        new HomePage().printOutTheTasksInsideWhatWeDoTab();
    }

    @Then("^user is successfully prints the list of tasks$")
    public void userIsSuccessfullyPrintsTheListOfTasks() throws InterruptedException{
        new HomePage().userAcceptsAllCookies();
        new HomePage().mouseHoverOnWhatWeDoTab();
        new HomePage().listOutTheTasksInsideWhatWeDoTab();
    }
}
