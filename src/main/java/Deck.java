import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck;

    public Deck(){
        deck = new ArrayList<Card>();
    }


    public int numberOfCardsInDeck() {
        return deck.size();
    }

    public void addCardToDeck(Card card){
        deck.add(card);
    }

    public void populate() {
        SuitType[] suitTypes = SuitType.values();
        RankType[] rankTypes = RankType.values();

        for (SuitType suitType : suitTypes){
            for (RankType rankType : rankTypes){
                Card card = new Card(suitType, rankType);
                deck.add(card);
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(this.deck);
    }

    public Card dealACard(){
       return this.deck.remove(0);
    }
}
