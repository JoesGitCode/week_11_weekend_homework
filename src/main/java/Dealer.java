import java.util.ArrayList;

public class Dealer {

    private ArrayList<Card> dealerHand;
    private Player player;

    public Dealer(){
        dealerHand = new ArrayList<Card>();
        player = new Player();
    }

    public int numberOfCardsInHandDealer(){
        return dealerHand.size();
    }

    public Card dealACard(Deck deck){
        return deck.dealACard();
    }

    public void addCard(Card card){
        dealerHand.add(card);
    }

    public ArrayList<Card> dealersHand(){
        return dealerHand;
    }

    public int dealerHandValue(){
        int total = 0;
        for (Card card : dealerHand){
            total += card.rankType.getValueOfCard();
        }
        return total;
    }

    public void resetHand(){
        dealerHand.clear();
    }
}
