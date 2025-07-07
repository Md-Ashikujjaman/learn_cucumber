package step_defination;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pages.LoginPage;
import pages.MainPage;

public class Login {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    @Given("User should be on the login page")
    public void userShouldBeOnTheLoginPage() {
        mainPage.loadAPage(mainPage.url);
        mainPage.clickOnElement(mainPage.login_btn);
    }

    @When("User enter valid username")
    public void userEnterValidUsername() {
        loginPage.writeOneElement(loginPage.username_input, loginPage.username);
    }

    @And("User enter valid password")
    public void userEnterValidPassword() {
        loginPage.writeOneElement(loginPage.password_input, loginPage.password);
    }

    @And("User click on Login button")
    public void userClickOnLoginButton() {
        loginPage.clickOnElement(loginPage.login_btn);

    }

    @Then("User should successfully logged in")
    public void userShouldSuccessfullyLoggedIn() {
        Assert.assertEquals(mainPage.getElementText(mainPage.username), loginPage.username);
    }

    @But("User should not see the login button")
    public void userShouldNotSeeTheLoginButton() {
        Assert.assertTrue(mainPage.waitForElementVisible(mainPage.user_icon).isDisplayed());
    }
}
