package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.AddCarPage;
import com.ilcarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCarSteps {

    WebDriver driver = new ChromeDriver();
    HomePage homePage = new HomePage(driver);
    AddCarPage addCarPage = new AddCarPage(driver);

    @When("User clicks on Add Car button")
    public void clickAddCar(){
        // метод из HomePage
    }

    @And("User fills car form")
    public void fillForm(){
        addCarPage.fillForm("Berlin","BMW","2020");
    }

    @And("User submits new car")
    public void submit(){
        addCarPage.submit();
    }

    @Then("User verifies car added successfully")
    public void verify(){
        assert addCarPage.isCarAdded();
    }
}
