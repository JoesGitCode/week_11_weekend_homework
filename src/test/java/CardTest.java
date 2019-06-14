import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.CLUBS, RankType.EIGHT);
    }

    @Test
    public void aCardHasASuit(){
        assertEquals(SuitType.CLUBS, card.getSuit());
    }

    @Test
    public void aCardHasARank(){
        assertEquals(RankType.EIGHT, card.getRank());
    }

    @Test public void aCardHasAValue(){
        assertEquals(8, card.rankType.getValueOfCard());
    }

}
