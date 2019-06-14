import java.util.ArrayList;

public class Dealer {

    private ArrayList<Card> dealerHand;

    public Dealer(){
        dealerHand = new ArrayList<Card>();
    }

    public int numberOfCardsInHandDealer(){
        return dealerHand.size();
    }

    public Card dealerDealACard(Deck deck){
        return deck.dealACard();
    }

    public void dealCardToSelf(Deck deck){
        Card card = deck.dealACard();
        dealerHand.add(card);
    }

    public int dealerHandValue(){
        int total = 0;
        for (Card card : dealerHand){
            total += card.rankType.getValueOfCard();
        }
        return total;
    }
}
