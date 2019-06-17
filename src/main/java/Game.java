import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private Dealer dealer;
    private Deck deck;
    private Player player;

    public Game(Deck deck, Dealer dealer, Player player){
        this.dealer = dealer;
        this.deck = deck;
        this.player = player;
        play();

    }


    public void addCardToDealer(){
        Card card = dealer.dealACard(deck);
        dealer.addCard(card);
    }

    public void addCardToPlayer(){
        Card card = dealer.dealACard(deck);
        player.addCard(card);
    }

    public void openingDeal(){
        this.addCardToPlayer();
        this.addCardToDealer();
        this.addCardToPlayer();
        this.addCardToDealer();
    }

//    public void dealerBlackjack(){
//        for (Card card : dealer.dealersHand()){
//
//        }
//    }

    public boolean checkPlayerBust(){
       return player.playerHandValue() > 21;
    }

    public boolean checkDealerBust(){
       return dealer.dealerHandValue() > 21;
    }

    public void stickOrTwist(){
        System.out.println("Your cards are " + player.getPlayerHand());
        System.out.println("With a value of " + player.playerHandValue());

        Scanner reader = new Scanner(System.in);
        System.out.println("Would you like to stick or twist? ");
        String answer = reader.next();
        reader.close();
        if (answer == "twist"){
            this.addCardToPlayer();
            stickOrTwist();
        }
    }


    public String play(){
        openingDeal();
        stickOrTwist();
        dealersTurn();
        if (player.playerHandValue() > dealer.dealerHandValue()){
            return "win";
        } else {
            return "lose";
        }
    }

    public void dealersTurn(){
        if (dealer.dealerHandValue() < 16){
            this.addCardToDealer();
        }
    }
}
