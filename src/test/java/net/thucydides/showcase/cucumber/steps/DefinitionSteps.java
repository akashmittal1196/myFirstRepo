package net.thucydides.showcase.cucumber.steps;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class DefinitionSteps {


    @Steps
    EndUserSteps steps;

    @Given("^user is on page$")
    public void user_is_on_page() {
    }


    @Given("^login$")
    public void login() {
    }

    @Given("^user is on home page$")
    public void user_is_on_home_page() throws Throwable{
        steps.user_is_on_home_page();
    }
}
