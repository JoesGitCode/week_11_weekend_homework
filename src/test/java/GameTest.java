import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GameTest {

    Dealer dealer;
    Deck deck;

    @Before
    public void before(){
        dealer = new Dealer();
        deck = new Deck();
    }

//    @Test
//    public void canAddCardToDealersHand(){
//        Card card = dealer.dealACard(deck);
//        dealer.addCard(card);
//        assertEquals(1, dealer.numberOfCardsInHandDealer());
//        assertEquals(51, deck.numberOfCardsInDeck());
//
//    }
//
//
//    @Test
//    public void canCalculateDealersHand(){
//        dealer.dealACard(deck);
//        assertNotEquals(50, dealer.dealerHandValue());
//        // couldnt figure out how to test this
//        // so it should print a random integer between 1 and 10
//        System.out.println(dealer.dealerHandValue());
//    }

}
