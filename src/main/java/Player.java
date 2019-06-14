import java.util.ArrayList;

public class Player {

    private ArrayList<Card> playerHand;

    public Player(){
        playerHand = new ArrayList<Card>();
    }

    public int numberOfCardsInHand(){
        return playerHand.size();
    }
}
