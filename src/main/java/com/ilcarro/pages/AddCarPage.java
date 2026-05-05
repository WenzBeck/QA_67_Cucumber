package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCarPage extends BasePage{

    public AddCarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "city")
    WebElement cityInput;

    @FindBy(id = "model")
    WebElement modelInput;

    @FindBy(id = "year")
    WebElement yearInput;

    @FindBy(css = "button[type='submit']")
    WebElement submitBtn;

    @FindBy(css = ".message")
    WebElement successMessage;

    public AddCarPage fillForm(String city, String model, String year){
        type(cityInput, city);
        type(modelInput, model);
        type(yearInput, year);
        return this;
    }

    public AddCarPage submit(){
        click(submitBtn);
        return this;
    }

    public boolean isCarAdded(){
        return shouldHaveText(successMessage,"added",10);
    }
}
