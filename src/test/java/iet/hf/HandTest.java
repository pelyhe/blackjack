package iet.hf;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HandTest {
    static Hand h;

    @BeforeAll
    public static void init(){
        h=new Hand();
    }

    @Test
    public void calculateTotalTest() throws InvalidCardValueException, InvalidCardSuitException {
        //ace
        Card c1=new Card('H', 1);
        //10
        Card c2=new Card('H', 10);
        //2
        Card c3=new Card('H', 2);

        //aceflag is not true
        h.clearHand();
        h.addCard(c2);
        h.addCard(c3);
        Assertions.assertEquals(12, h.calculateTotal());

        //aceflag is true and ace should worth 11
        h.clearHand();
        h.addCard(c2);
        h.addCard(c1);
        Assertions.assertEquals(21, h.calculateTotal());

        //aceflasg is true and ace should worth 1
        h.clearHand();
        h.addCard(c1);
        h.addCard(c2);
        h.addCard(c3);
        Assertions.assertEquals(13, h.calculateTotal());
    }

    @Test
    public void testAddCard() throws InvalidCardValueException, InvalidCardSuitException {
        Card c1=new Card('H', 1);
        h.clearHand();
        h.addCard(c1);

        Assertions.assertTrue(h.getTheHand()[0].compareTo(c1));
    }

    @Test
    public void testDealerPeek() throws InvalidCardValueException, InvalidCardSuitException {
        Card c1=new Card('H', 1);
        Card c2=new Card('H', 10);
        Card c3=new Card('H', 2);

        //if hand has an ace as the second card
        h.clearHand();
        h.addCard(c1);
        h.addCard(c1);
        Assertions.assertTrue(h.dealerPeek());

        //if hand has a 10 as the second card
        h.clearHand();
        h.addCard(c1);
        h.addCard(c2);
        Assertions.assertTrue(h.dealerPeek());

        //if hand don't have an ace and a 10 as the second card
        h.clearHand();
        h.addCard(c1);
        h.addCard(c3);
        Assertions.assertTrue(!h.dealerPeek());
    }
}
