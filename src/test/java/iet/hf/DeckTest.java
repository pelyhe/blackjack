package iet.hf;

import iet.hf.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DeckTest {
    static Deck d;

    @BeforeAll
    public static void init(){
        d=new Deck();
    }

    @Test
    public void testCtor(){
        Assertions.assertEquals(d.deck.length, 52);
    }

    @Test
    public void testSwapCards() throws InvalidDeckPositionException {
        Card c1=d.deck[0];
        Card c2=d.deck[1];

        d.swapCards(0, 1);
        //test if the cards are swapped
        Assertions.assertTrue(d.deck[0].compareTo(c2));
        Assertions.assertTrue(d.deck[1].compareTo(c1));

        //test for exception
        InvalidDeckPositionException exception1=Assertions.assertThrows(InvalidDeckPositionException.class, ()->d.swapCards(-1, 0));
        InvalidDeckPositionException exception2=Assertions.assertThrows(InvalidDeckPositionException.class, ()->d.swapCards(0, 52));
    }

    @Test
    public void testIsIndexGood(){
        InvalidDeckPositionException exception1=Assertions.assertThrows(InvalidDeckPositionException.class, ()->d.isIndexGood(-1));
        InvalidDeckPositionException exception2=Assertions.assertThrows(InvalidDeckPositionException.class, ()->d.isIndexGood(52));
    }

    @Test
    public void testGetCard() throws InvalidDeckPositionException, InvalidCardValueException, InvalidCardSuitException {
        Assertions.assertTrue(d.getCard(0).compareTo(new Card('H', 2)));
    }

    @Test
    public void nextCard(){
        Assertions.assertTrue(d.nextCard().compareTo(d.deck[0]));

        d.setNextCardIndex(-1);
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, ()->d.nextCard());
        d.setNextCardIndex(52);
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, ()->d.nextCard());
    }

    @Test
    public void testCompareTo() throws InvalidCardValueException, InvalidCardSuitException, InvalidDeckPositionException {
        Deck d=new Deck();
        Deck d1=new Deck();
        Deck d2=new Deck();

        Card c=new Card('H', 2);

        d2.swapCards(0, 1);

        Assertions.assertTrue(d.compareTo(d1));
        Assertions.assertTrue(!d.compareTo(d2));
    }
}
