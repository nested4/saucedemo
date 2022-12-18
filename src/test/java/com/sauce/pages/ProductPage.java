package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage{
    @FindBy (xpath = "//span[text()='Products']")
    public WebElement productHeader;

    @FindBy (xpath = "//select[@class='product_sort_container']")
    public WebElement sortSelect;

    @FindBy (xpath = "//a[@class='shopping_cart_link']")
    public WebElement openTheBasket;



    @FindBy (xpath = "//button[starts-with(@name,'add-to-cart')]")
    public List<WebElement> addToChartItems;

    public WebElement addToChart(int a){
        return addToChartItems.get(a);
    }


}



