package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterface.PageUserInterface.TEXT_EXPECTED;

public class MessageExpected implements Question<String> {
    public static MessageExpected fromPage() {
        return new MessageExpected();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(TEXT_EXPECTED).viewedBy(actor).asString();
    }
}
