package com.sauce.stepDefs;

import com.sauce.pages.CheckoutYourInformationPage;
import com.sauce.pages.FinishPage;
import com.sauce.pages.YourChartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class YourChart_StepDefs {

    YourChartPage yourChartPage = new YourChartPage();
    CheckoutYourInformationPage checkoutYourInformationPage= new CheckoutYourInformationPage();
    FinishPage finishPage = new FinishPage();
    @When("The user checks out")
    public void the_user_checks_out() {
        yourChartPage.checkout.click();
    }


    @And("The user enters name {string}, lastname {string} postal code {string} and clicks")
    public void theUserEntersNameLastnamePostalCodeAndClick(String name, String lastName, String zipCode) {
        checkoutYourInformationPage.enterInfo(name,lastName,zipCode);
    }

    @And("The user clicks finish button")
    public void theUserClicksFinishButton() {
        finishPage.finishButton.click();

    }

    @Then("The user verifies the header {string}")
    public void theUserVerifiesTheHeader(String title) {
        Assert.assertEquals(title.toUpperCase(),finishPage.getTitle(title));
    }
}
