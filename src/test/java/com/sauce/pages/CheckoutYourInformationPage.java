package com.sauce.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutYourInformationPage extends BasePage {

    @FindBy (id = "first-name")
    public WebElement firstNameInput;

    @FindBy (id = "last-name")
    public WebElement lastNameInput;

    @FindBy (id = "postal-code")
    public WebElement postalCodeInput;

    @FindBy (id = "continue")
    public WebElement checkOut;

    public void enterInfo(String name, String lastName, String zipCode){
        firstNameInput.sendKeys(name);
        lastNameInput.sendKeys(lastName);
        postalCodeInput.sendKeys(zipCode);
        checkOut.click();
    }

}
