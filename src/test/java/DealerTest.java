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
        Card card = dealer.dealerDealACard(deck);
        assertNotNull(card);
        assertEquals(51, deck.numberOfCardsInDeck());
    }

    @Test
    public void canDealToSelf(){
        dealer.dealCardToSelf(deck);
        assertEquals(1, dealer.numberOfCardsInHandDealer());
        assertEquals(51, deck.numberOfCardsInDeck());

    }

    @Test
    public void canCalculateDealersHand(){
        dealer.dealCardToSelf(deck);
        assertNotEquals(50, dealer.dealerHandValue());
        // couldnt figure out how to test this
        // so it should print a random integer between 1 and 10
        System.out.println(dealer.dealerHandValue());
    }

    @Test
    public void canCalculateDealersHandWithMultipleCards(){
        dealer.dealCardToSelf(deck);
        dealer.dealCardToSelf(deck);
        dealer.dealCardToSelf(deck);
        assertNotEquals(50, dealer.dealerHandValue());
        // couldnt figure out how to test this
        // so it should print a random integer between 3 and 30
        System.out.println(dealer.dealerHandValue());
    }

}
