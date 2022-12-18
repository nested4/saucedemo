package com.sauce.stepDefs;

import com.sauce.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class Purchase_stepDefs {
    ProductPage productPage = new ProductPage();
    @When("The user sort the products {string}")
    public void the_user_sort_the_products(String string) {
        Select select = new Select(productPage.sortSelect);
        select.selectByVisibleText(string);
    }

    @And("The user selects the cheapest item {string}")
    public void theUserSelectsTheCheapestItem(String itemNumber) {
        productPage.addToChart(Integer.parseInt(itemNumber)-1).click();
    }

    @And("The user clicks the open the basket")
    public void theUserClicksTheOpenTheBasket() {
        productPage.openTheBasket.click();
    }
}
