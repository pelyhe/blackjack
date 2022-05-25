package iet.hf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions {
    Card c1;
    Card c2;
    Card c3;
    Card c4;
    Card c5;
    Card c6;
    Card c7;
    Card c8;
    Card c9;
    Card c10;
    Card c11;
    Card c12;
    Card c13;

    String cardSuitName1;
    String cardSuitName2;
    String cardSuitName3;
    String cardSuitName4;
    @Given("The card")
    public void theCard() throws InvalidCardValueException, InvalidCardSuitException {
        c1=new Card('H' , 1);
        c2=new Card('S' , 2);
        c3=new Card('C' , 3);
        c4=new Card('D' , 4);

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

    String valueName1;
    String valueName2;
    String valueName3;
    String valueName4;
    String valueName5;
    String valueName6;
    String valueName7;
    String valueName8;
    String valueName9;
    String valueName10;
    String valueName11;
    String valueName12;
    String valueName13;
    @Given("The cards to test")
    public void theCardsToTest() throws InvalidCardValueException, InvalidCardSuitException {
        c1=new Card('H' , 1);
        c2=new Card('S' , 2);
        c3=new Card('C' , 3);
        c4=new Card('D' , 4);
        c5=new Card('H' , 5);
        c6=new Card('S' , 6);
        c7=new Card('C' , 7);
        c8=new Card('D' , 8);
        c9=new Card('H' , 9);
        c10=new Card('S' , 10);
        c11=new Card('C' , 11);
        c12=new Card('D' , 12);
        c13=new Card('D' , 13);
    }

    @When("Getting value name")
    public void gettingValueName() {
        valueName1=c1.getValueName();
        valueName2=c2.getValueName();
        valueName3=c3.getValueName();
        valueName4=c4.getValueName();
        valueName5=c5.getValueName();
        valueName6=c6.getValueName();
        valueName7=c7.getValueName();
        valueName8=c8.getValueName();
        valueName9=c9.getValueName();
        valueName10=c10.getValueName();
        valueName11=c11.getValueName();
        valueName12=c12.getValueName();
        valueName13=c13.getValueName();

    }

    @Then("value name will be correct")
    public void valueNameWillBeCorrect() {
        Assert.assertEquals(valueName1,"Ace");
        Assert.assertEquals(valueName2,"Two");
        Assert.assertEquals(valueName3,"Three");
        Assert.assertEquals(valueName4,"Four");
        Assert.assertEquals(valueName5,"Five");
        Assert.assertEquals(valueName6,"Six");
        Assert.assertEquals(valueName7,"Seven");
        Assert.assertEquals(valueName8,"Eight");
        Assert.assertEquals(valueName9,"Nine");
        Assert.assertEquals(valueName10,"Ten");
        Assert.assertEquals(valueName11,"Jack");
        Assert.assertEquals(valueName12,"Queen");
        Assert.assertEquals(valueName13,"King");

    }

    boolean c1Eqc2;
    boolean c1Eqc3;
    @Given("three cards to compare suit")
    public void cards() throws InvalidCardValueException, InvalidCardSuitException {
        c1=new Card('H' , 1);
        c2=new Card('H' , 2);
        c3=new Card('C' , 3);
    }

    @When("comparing suits")
    public void comparingSuits() {
        c1Eqc2=c1.compareSuit(c2);
        c1Eqc3=c1.compareSuit(c3);
    }

    @Then("suit will be compared correctly")
    public void suitWillBeComparedCorrectly() {
        Assert.assertTrue(c1Eqc2);
        Assert.assertFalse(c1Eqc3);
    }


    @Given("three cards to compare value")
    public void threeCards() throws InvalidCardValueException, InvalidCardSuitException {
        c1=new Card('H' , 1);
        c2=new Card('H' , 1);
        c3=new Card('C' , 3);
    }

    @When("comparing values")
    public void comparingValues() {
        c1Eqc2=c1.compareValue(c2);
        c1Eqc3=c1.compareValue(c3);
    }

    @Then("compare results will be correct")
    public void compareResultsWillBeCorrect() {
        Assert.assertTrue(c1Eqc2);
        Assert.assertFalse(c1Eqc3);
    }

    @Given("three cards to compare")
    public void threeCardsToCompare() throws InvalidCardValueException, InvalidCardSuitException {
        c1=new Card('H' , 1);
        c2=new Card('H' , 1);
        c3=new Card('C' , 3);
    }

    @When("comparing two cards")
    public void comparingTwoCards() {
        c1Eqc2=c1.compareTo(c2);
        c1Eqc3=c1.compareTo(c3);
    }

    @Then("compare result will be right")
    public void compareResultWillBeRight() {
        Assert.assertTrue(c1Eqc2);
        Assert.assertFalse(c1Eqc3);
    }
}
