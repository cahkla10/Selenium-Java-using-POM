package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.HomePage;
import static setups.DriverPool.getDriverInstance;

public class HomePageStep {

    HomePage homePage = new HomePage(getDriverInstance());

    @Given("^User open the web$")
    public void userOpenTheWeb() throws Throwable {
        getDriverInstance().navigate().to("http://merapisoftware.site/");
    }

    @Then("^User on homepage$")
    public void userOnHomepage() throws Throwable {

        //navbar

        homePage.clickServices();
        homePage.clickPortfolio();
        homePage.clickAbout();
        homePage.clickContact();
        homePage.clickClient();
    }
}