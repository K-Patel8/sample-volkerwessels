package com.localhost.pages;

import com.localhost.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/*
Created by : Kaushik Patel
*/
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Save and close')]")
    WebElement saveAndCloseCookies;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement whatWeDoTab;

    @CacheLookup
    @FindBy(xpath = "//div//li//li//a[.=\"Rail infrastructure\"]")
    WebElement railInfrastructureInWhatWeDo;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Rail infrastructure')]")
    WebElement getSearchText;

    @CacheLookup
    @FindBy(xpath = "//ul[contains(@class,'row clearfix')]//li[2]//div//ul//li//a")
    List<WebElement> whatWeDoTasks;

    public void userAcceptsAllCookies() {
        log.info("Clicking on accept all cookies : " + saveAndCloseCookies.toString());
        clickOnElement(saveAndCloseCookies);
    }

    public void mouseHoverOnWhatWeDoTab() {
        log.info("Hovering mouse pointer on \"WHAT WE DO\" tab" + whatWeDoTab.toString());
        mouseHoverToElement(whatWeDoTab);

    }

    public void clickOnRailInfrastructureFromDropDown() {
        log.info("Clicking on option \"Rail Infrastructure\" from dropdown" + railInfrastructureInWhatWeDo.toString());
        clickOnElement(railInfrastructureInWhatWeDo);
    }

    public String gettingTextForVerificationForNavigatedPage() {
        log.info("Getting text to verify : " + getSearchText.toString());
        String actualText = getTextFromElement(getSearchText);
        return actualText;
    }

    public void listOutTheTasksInsideWhatWeDoTab() throws InterruptedException {
        List<WebElement> options = whatWeDoTasks;
        System.out.println(" ");
        System.out.println("List of Task in WHAT WE DO Tab");
        System.out.println("------------------------------");
        Thread.sleep(3000);
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }

    public void printOutTheTasksInsideWhatWeDoTab() {

        List<WebElement> options = whatWeDoTasks;
        System.out.println("List of Task in WHAT WE DO Tab : " + options.size());
    }
}
