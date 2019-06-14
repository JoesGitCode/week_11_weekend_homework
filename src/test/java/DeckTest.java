import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.SPADES, RankType.ACE);
    }

//    @Test
//    public void aDeckStartsEmpty(){
//        assertEquals(0, deck.numberOfCardsInDeck());
//    }

//    @Test
//    public void aCardCanBeAddedToTheDeck(){
//        deck.addCardToDeck(card);
//        assertEquals(1, deck.numberOfCardsInDeck());
//    }

    @Test
    public void allCardVarietiesCanBeAddedToTheDeck(){
        assertEquals(52, deck.numberOfCardsInDeck());
    }

    @Test
    public void theDeckShuffleAndDealsARandomCard(){
        Card unshuffledCard = new Card(SuitType.HEARTS, RankType.ACE);
        Deck deck1 = new Deck();
        Card card1 = deck1.dealACard();
        assertNotEquals(unshuffledCard, card1);
//         log should be a different card each time test is run
        System.out.println(card1.getSuit());
        System.out.println(card1.getRank());
    }

}
