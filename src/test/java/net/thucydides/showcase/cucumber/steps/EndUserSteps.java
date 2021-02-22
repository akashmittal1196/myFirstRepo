package net.thucydides.showcase.cucumber.steps;


import net.thucydides.core.annotations.Step;
import net.thucydides.showcase.cucumber.pages.LandingPage;

public class EndUserSteps {


    LandingPage landingPage;
    @Step
    public void user_is_on_page() {
    }

    @Step
    public void login() {
    }

    @Step
    public void user_is_on_home_page() throws Throwable{
        landingPage.openURL();
    }



}
