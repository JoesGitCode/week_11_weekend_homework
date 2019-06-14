import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.SPADES, RankType.ACE);
    }

    @Test
    public void aDeckStartsEmpty(){
        assertEquals(0, deck.numberOfCardsInDeck());
    }

    @Test
    public void aCardCanBeAddedToTheDeck(){
        deck.addCardToDeck(card);
        assertEquals(1, deck.numberOfCardsInDeck());
    }

    @Test
    public void allCardVarietiesCanBeAddedToTheDeck(){
        deck.populate();
        assertEquals(52, deck.numberOfCardsInDeck());
    }


}
