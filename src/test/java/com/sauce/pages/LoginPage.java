package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy (id ="user-name" )
    public WebElement inputUsername;

    @FindBy (id ="password" )
    public WebElement inputPassword;

    @FindBy (id ="login-button" )
    public WebElement loginButton;

    public void loginUser(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }

    public void loginUser(){
        inputUsername.sendKeys("standard_user");
        inputPassword.sendKeys("secret_sauce");
        loginButton.click();
    }




}
