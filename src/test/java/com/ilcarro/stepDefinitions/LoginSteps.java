package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.ilcarro.pages.BasePage.driver;

public class LoginSteps {

    LoginPage login;

   /* @Given("User is logged in")
    public void userIsLoggedIn() {

        driver = new ChromeDriver();

        HomePage homePage = new HomePage(driver);
        homePage.openUrl();
        homePage.clickOnLoginLink();

        login = new LoginPage(driver);
        login.enterData("test222@gmail.com", "Test12345!");
        login.clickOnYalla();
    } */

    @And("User clicks on Login link")
    public void click_On_Login_Link(){
        new HomePage(driver).clickOnLoginLink();
    }
    @And("User enters correct data")
    public void User_enters_correct_data(){
        login = new LoginPage(driver);
        login.enterData("test222@gmail.com","Test12345!");
    }
    @And("User clicks on Yalla button")
    public void User_clicks_on_Yalla_button(){
        login.clickOnYalla();
    }

    @Then("User verifies success message is displayed")
    public void verify_Success_login(){
        login.verifyMessage("You are logged in success");
    }

    @And("User enters correct email and incorrect password")
    public void enter_wrong_password(DataTable table){
        login = new LoginPage(driver);
        login.enterWrongPassword(table);

    }

    @Then("User verifies error message is displayed")
    public void verifyErrorMessage(){
        login.verifyMessage("Login failed");
    }

}

