import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GameTest {

    Game game;
    Dealer dealer;
    Deck deck;
    Player player;

    @Before
    public void before(){
        deck = new Deck();
        dealer = new Dealer();
        player = new Player();
        game = new Game(deck, dealer, player);


    }

    @Test
    public void canAddACardToTheDealer(){
        game.addCardToDealer();
        assertEquals(1, dealer.numberOfCardsInHandDealer());
        assertEquals(51, deck.numberOfCardsInDeck());
    }

    @Test
    public void canDealTwoCardsToDealer(){
        game.play();
        assertEquals(2, dealer.numberOfCardsInHandDealer());
        assertEquals(48, deck.numberOfCardsInDeck());
        System.out.println(dealer.dealerHandValue());
    }

    @Test
    public void canAddACardToThePlayer(){
        game.addCardToPlayer();
        assertEquals(1, player.numberOfCardsInHand());
        assertEquals(51, deck.numberOfCardsInDeck());
    }

    @Test
    public void canDealTwoCardsToPlayer(){
        game.play();
        assertEquals(2, player.numberOfCardsInHand());
        assertEquals(48, deck.numberOfCardsInDeck());
        System.out.println(player.playerHandValue());
    }

    @Test
    public void theHighestCardTotalWins(){
        assertEquals("win", game.play());
        System.out.println(player.playerHandValue());
        System.out.println(dealer.dealerHandValue());

    }

    @Test
    public void wontGoBustAfterFirstTwoCards(){
        game.play();
        assertEquals(false, game.checkDealerBust());
        assertEquals(false, game.checkPlayerBust());
    }

    @Test
    public void playerCanGoBust(){
        game.play();
        game.stickOrTwist();

        game.addCardToPlayer();
        game.addCardToPlayer();
        game.addCardToPlayer();
        game.addCardToPlayer();
        System.out.println(player.playerHandValue());
        assertEquals(true, game.checkPlayerBust());
    }

    @Test
    public void dealerCanGoBust(){
        game.play();
        game.addCardToDealer();
        game.addCardToDealer();
        game.addCardToDealer();
        game.addCardToDealer();
        game.addCardToDealer();
        System.out.println(dealer.dealerHandValue());
        assertEquals(true, game.checkDealerBust());
    }


}
