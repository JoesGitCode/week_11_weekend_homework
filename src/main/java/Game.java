import java.util.ArrayList;

public class Game {

    private Dealer dealer;
    private Deck deck;
    private Player player;

    public Game(Deck deck, Dealer dealer, Player player){
        this.dealer = dealer;
        this.deck = deck;
        this.player = player;

    }


    public void addCardToDealer(){
        Card card = dealer.dealACard(deck);
        dealer.addCard(card);
    }

    public void addCardToPlayer(){
        Card card = dealer.dealACard(deck);
        player.addCard(card);
    }

    public String play(){
        this.addCardToDealer();
        this.addCardToDealer();
        this.addCardToPlayer();
        this.addCardToPlayer();
        if (player.playerHandValue() > dealer.dealerHandValue()){
            return "win";
        } else {
            return "lose";
        }
    }
}
