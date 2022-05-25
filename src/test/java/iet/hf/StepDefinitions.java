package iet.hf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefinitions {
    Card c1;
    Card c2;
    Card c3;
    Card c4;
    String cardSuitName1;
    String cardSuitName2;
    String cardSuitName3;
    String cardSuitName4;
    @Given("The card")
    public void theCard() throws InvalidCardValueException, InvalidCardSuitException {
        c1=new Card('H' , 2);
        c2=new Card('S' , 2);
        c3=new Card('C' , 2);
        c4=new Card('D' , 2);

    }

    @When("Getting suit name")
    public void gettingSuitName() {
        cardSuitName1 =c1.getSuitName();
        cardSuitName2 =c2.getSuitName();
        cardSuitName3 =c3.getSuitName();
        cardSuitName4 =c4.getSuitName();
    }

    @Then("Suit name will be correct")
    public void suitNameWillBeCorrect() {
        Assert.assertEquals(cardSuitName1, "Hearts");
        Assert.assertEquals(cardSuitName2, "Spades");
        Assert.assertEquals(cardSuitName3, "Clubs");
        Assert.assertEquals(cardSuitName4, "Diamonds");
    }
}
