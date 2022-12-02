package stepsdefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.MessageExpected;
import tasks.SearchIn;
import userinterface.PageUserInterface;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TestingStepsDefinition {
    @Managed(driver="chrome")
    private WebDriver chromeBrowser;
    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("user").can(BrowseTheWeb.with(chromeBrowser));
    }
    @Given("^User go through the page$")
    public void userGoThroughThePage() {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn(new PageUserInterface()));
    }

    @When("^User search a text$")
    public void userSearchAText() {
        theActorInTheSpotlight().attemptsTo(SearchIn.theHexactapage());
    }

    @Then("^User verify the the expected result$")
    public void userVerifyTheTheExpectedResult() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(MessageExpected.fromPage(), Matchers.equalTo("WHAT NOT TO DO WHEN WORKING WITH AN OUTSOURCED SOFTWARE TEAM")));
    }
}
