package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static userinterface.PageUserInterface.SEARCH_BUTTON;
import static userinterface.PageUserInterface.SEARCH_FIELD;

public class SearchIn implements Task {
    public static SearchIn theHexactapage() {
        return Tasks.instrumented(SearchIn.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SEARCH_BUTTON),
                Enter.theValue("Outsource"+String.valueOf(Keys.ENTER)).into(SEARCH_FIELD));
    }
}
