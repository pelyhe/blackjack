import iet.hf.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DealerTest {
    @Test
    public void testIsBlackJack() throws InvalidCardValueException, InvalidCardSuitException {
        Dealer d=new Dealer();
        //ace
        Card c1=new Card('H', 1);
        //10
        Card c2=new Card('H', 10);
        //2
        Card c3=new Card('H', 2);

        //adding cards
        d.addCard(c1);
        d.addCard(c2);
        //dealer will have black jack
        Assertions.assertTrue(d.isBlackjack());

        //removing cards
        d.clearHand();

        d.addCard(c1);
        d.addCard(c3);
        //dealer will not have black jack
        Assertions.assertTrue(!d.isBlackjack());
    }

    @Test
    public void testDealerPlay(){
        Dealer d=new Dealer();
        Deck deck=new Deck();

        d.dealerPlay(deck);

        Assertions.assertTrue(d.calculateTotal()>16);
    }

    @Test
    public void calculateTotal() throws InvalidCardValueException, InvalidCardSuitException {
        Dealer d=new Dealer();
        //ace
        Card c1=new Card('H', 1);
        //10
        Card c2=new Card('H', 10);
        //2
        Card c3=new Card('H', 2);

        d.addCard(c1);
        d.addCard(c2);
        //test if ace should worth 11
        Assertions.assertEquals(d.calculateTotal(), 21);

        d.clearHand();
        d.addCard(c2);
        d.addCard(c3);
        //test if there is no ace
        Assertions.assertEquals(d.calculateTotal(), 12);

        d.clearHand();
        d.addCard(c2);
        d.addCard(c3);
        d.addCard(c1);

        //test if ace should worth 1
        Assertions.assertEquals(d.calculateTotal(), 13);
    }

}
