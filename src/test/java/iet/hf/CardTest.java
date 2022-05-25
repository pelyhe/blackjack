package iet.hf;

import iet.hf.Card;
import iet.hf.InvalidCardSuitException;
import iet.hf.InvalidCardValueException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CardTest {
    static Card c;

    @BeforeAll
    public static void init(){
        try {
            c=new Card('H', 2);
        } catch (InvalidCardValueException e) {
            System.out.println(e);
        } catch (InvalidCardSuitException e) {
            System.out.println(e);
        }
    }

    @Test
    public void testCtorExceptions(){
        //if suit is invalid
        InvalidCardSuitException suitException=Assertions.assertThrows(InvalidCardSuitException.class, ()->new Card('Q',1));
        //if value is greater than max value
        InvalidCardValueException valueExceptionGt=Assertions.assertThrows(InvalidCardValueException.class, ()->new Card('H',14));
        //if value is less than min value
        InvalidCardValueException valueExceptionLs=Assertions.assertThrows(InvalidCardValueException.class, ()->new Card('H',0));
    }

    @Test
    public void testToString(){
        Assertions.assertTrue(c.toString().equals("Hearts 2"));
    }

    @Test
    public void testGetSuitName() throws InvalidCardValueException, InvalidCardSuitException {
        Card c1=new Card('H', 2);
        Card c2=new Card('S', 2);
        Card c3=new Card('C', 2);
        Card c4=new Card('D', 2);

        Assertions.assertTrue(c1.getSuitName().equals("Hearts"));
        Assertions.assertTrue(c2.getSuitName().equals("Spades"));
        Assertions.assertTrue(c3.getSuitName().equals("Clubs"));
        Assertions.assertTrue(c4.getSuitName().equals("Diamonds"));
    }


    @Test
    public void testGetters(){
        Assertions.assertEquals(c.getSuitDesignator(), 'H');
        Assertions.assertEquals(c.getValue(), 2);
    }

    @Test
    public void testGetValueName() throws InvalidCardValueException, InvalidCardSuitException {
        Card c1=new Card('H', 1);
        Card c2=new Card('H', 2);
        Card c3=new Card('H', 3);
        Card c4=new Card('H', 4);
        Card c5=new Card('H', 5);
        Card c6=new Card('H', 6);
        Card c7=new Card('H', 7);
        Card c8=new Card('H', 8);
        Card c9=new Card('H', 9);
        Card c10=new Card('H', 10);
        Card c11=new Card('H', 11);
        Card c12=new Card('H', 12);
        Card c13=new Card('H', 13);

        Assertions.assertTrue(c1.getValueName().equals("Ace"));
        Assertions.assertTrue(c2.getValueName().equals("Two"));
        Assertions.assertTrue(c3.getValueName().equals("Three"));
        Assertions.assertTrue(c4.getValueName().equals("Four"));
        Assertions.assertTrue(c5.getValueName().equals("Five"));
        Assertions.assertTrue(c6.getValueName().equals("Six"));
        Assertions.assertTrue(c7.getValueName().equals("Seven"));
        Assertions.assertTrue(c8.getValueName().equals("Eight"));
        Assertions.assertTrue(c9.getValueName().equals("Nine"));
        Assertions.assertTrue(c10.getValueName().equals("Ten"));
        Assertions.assertTrue(c11.getValueName().equals("Jack"));
        Assertions.assertTrue(c12.getValueName().equals("Queen"));
        Assertions.assertTrue(c13.getValueName().equals("King"));
    }

    @Test
    public void test(){

    }

    @Test
    public void testCompareSuit() throws InvalidCardValueException, InvalidCardSuitException {
        Card testCard1=new Card('S', 2);
        Card testCard2=new Card('H', 2);

        Assertions.assertTrue(!c.compareSuit(testCard1));
        Assertions.assertTrue(c.compareSuit(testCard2));
    }

    @Test
    public void testCompareValue() throws InvalidCardValueException, InvalidCardSuitException {
        Card testCard1=new Card('S', 3);
        Card testCard2=new Card('H', 2);

        Assertions.assertTrue(!c.compareValue(testCard1));
        Assertions.assertTrue(c.compareValue(testCard2));
    }

    @Test
    public void testCompareTo() throws InvalidCardValueException, InvalidCardSuitException {
        Card testCard1=new Card('S', 3);
        Card testCard2=new Card('H', 3);
        Card testCard3=new Card('H', 2);

        Assertions.assertTrue(!c.compareTo(testCard1));
        Assertions.assertTrue(!c.compareTo(testCard2));
        Assertions.assertTrue(c.compareTo(testCard3));
    }
}
