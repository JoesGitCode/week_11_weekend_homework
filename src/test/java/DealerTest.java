import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DealerTest {

    Dealer dealer;
    Deck deck;

    @Before
    public void before(){
        dealer = new Dealer();
        deck = new Deck();
    }

    @Test
    public void aDealerHasAHandThatStartsEmpty(){
        assertEquals(0, dealer.numberOfCardsInHandDealer());
    }

    @Test
    public void aDealerCanDealACard(){
        Card card = dealer.dealACard(deck);
        assertNotNull(card);
        assertEquals(51, deck.numberOfCardsInDeck());
    }

    @Test
    public void canDealToSelf(){
        Card card = dealer.dealACard(deck);
        dealer.addCard(card);
        assertEquals(1, dealer.numberOfCardsInHandDealer());
        assertEquals(51, deck.numberOfCardsInDeck());

    }

    @Test
    public void canCalculateDealersHand(){
        Card card = dealer.dealACard(deck);
        dealer.addCard(card);

        assertNotEquals(50, dealer.dealerHandValue());
        // couldnt figure out how to test this
        // so it should print a random integer between 1 and 10
        System.out.println(dealer.dealerHandValue());
    }

    @Test
    public void canCalculateDealersHandWithMultipleCards(){
        Card card1 = dealer.dealACard(deck);
        Card card2 = dealer.dealACard(deck);
        Card card3 = dealer.dealACard(deck);
        dealer.addCard(card1);
        dealer.addCard(card2);
        dealer.addCard(card3);

        assertNotEquals(50, dealer.dealerHandValue());
        // couldnt figure out how to test this
        // so it should print a random integer between 3 and 30
        System.out.println(dealer.dealerHandValue());
    }

    @Test
    public void aDealersHandCanBeReset(){
        Card card1 = dealer.dealACard(deck);
        dealer.addCard(card1);
        dealer.resetHand();
        assertEquals(0, dealer.dealerHandValue());
    }

}
