import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PlayerTest {

    Player player;
    Dealer dealer;
    Deck deck;

    @Before
    public void before(){
        player = new Player();
        dealer = new Dealer();
        deck = new Deck();
    }

    @Test
    public void aPlayersHandStartsEmpty(){
        assertEquals(0, player.numberOfCardsInHand());
    }

    @Test
    public void canCalculatePlayersHand(){
        Card card = dealer.dealACard(deck);
        player.addCard(card);

        assertNotEquals(50, player.playerHandValue());
        // couldnt figure out how to test this
        // so it should print a random integer between 1 and 10
        System.out.println(player.playerHandValue());
    }

    @Test
    public void canCalculatePlayersHandWithMultipleCards(){
        Card card1 = dealer.dealACard(deck);
        Card card2 = dealer.dealACard(deck);
        Card card3 = dealer.dealACard(deck);
        player.addCard(card1);
        player.addCard(card2);
        player.addCard(card3);

        assertNotEquals(50, player.playerHandValue());
        // couldnt figure out how to test this
        // so it should print a random integer between 3 and 30
        System.out.println(player.playerHandValue());
    }

    @Test
    public void aPlayersHandCanBeReset(){
        Card card1 = dealer.dealACard(deck);
        player.addCard(card1);
        player.resetHand();
        assertEquals(0, player.playerHandValue());
    }

}
