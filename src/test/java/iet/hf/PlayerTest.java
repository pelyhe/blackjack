package iet.hf;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerTest {


    @Test
    public void testGetBank(){
        Player p=new Player();
        System.out.println(p.getBet());
        System.out.println(p.getBank());
        Assertions.assertEquals(Player.initBank, p.getBank());
    }

    @Test
    public void testBust(){
        Player p=new Player();
        int bet=10;

        p.setBet(bet);
        p.bust();
        Assertions.assertEquals(Player.initBank-bet, p.getBank());
        Assertions.assertEquals(p.getBet(), 0);
    }

    @Test
    public void testWin(){
        Player p=new Player();
        int bet=10;

        p.setBet(bet);
        p.win();
        Assertions.assertEquals(Player.initBank+bet, p.getBank());
        Assertions.assertEquals(p.getBet(), 0);
    }

    @Test
    public void testLoss(){
        Player p=new Player();
        int bet=10;

        p.setBet(bet);
        p.loss();
        Assertions.assertEquals(Player.initBank-bet, p.getBank());
        Assertions.assertEquals(p.getBet(), 0);
    }

    @Test
    public void testRemoveFromGame(){
        Player p=new Player();
        p.removeFromGame();

        Assertions.assertEquals(-1, p.getBank());
    }

    @Test
    public void testResetBank(){
        Player p=new Player();
        p.resetBank();

        Assertions.assertEquals(0, p.getBank());
    }

    @Test
    public void testBlackJack(){
        int bet=10;

        Player p=new Player();
        p.setBet(bet);
        p.blackjack();

        Assertions.assertEquals(Player.initBank+(bet*1.5), p.getBank());
        Assertions.assertEquals(p.getBet(), 0);
    }

    @Test
    public void testPush(){
        int bet=10;

        Player p=new Player();
        p.setBet(bet);
        p.push();

        Assertions.assertEquals(p.getBet(), 0);
    }

    @Test
    public void testGettersSetters(){
        int bet=10;
        String name="name";

        Player p=new Player();

        p.setBet(bet);
        p.setName(name);

        Assertions.assertEquals(p.getBet(), bet);
        Assertions.assertTrue(p.getName().equals(name));
    }

}
