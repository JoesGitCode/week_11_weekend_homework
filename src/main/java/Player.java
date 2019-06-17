import java.util.ArrayList;

public class Player {

    private ArrayList<Card> playerHand;

    public Player(){
        playerHand = new ArrayList<Card>();
    }

    public int numberOfCardsInHand(){
        return playerHand.size();
    }
    public void addCard(Card card){
        playerHand.add(card);
    }

    public int playerHandValue(){
        int total = 0;
        for (Card card : playerHand){
            total += card.rankType.getValueOfCard();
        }
        return total;
    }

    public ArrayList getPlayerHand(){
        ArrayList cards = new ArrayList<String>();
        for (Card card : playerHand){
            String rankString = card.rankType.toString();
            cards.add(rankString);
        }
        return cards;
    }

    public void resetHand(){
        playerHand.clear();
    }


}
