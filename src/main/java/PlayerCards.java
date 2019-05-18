import java.util.ArrayList;
import java.util.List;

public class PlayerCards {

    public static List<Card> playerCards = new ArrayList<Card>();

    public static Card throwCard (int numberOfCard) {
        playerCards.remove(numberOfCard);
        Game.table.cardsOnTable.add(playerCards.get(numberOfCard));
        Game.table.cardOnTable().toString();
        return Game.table.cardOnTable();
    }

    public static List<Card> takeCard (int howManyCards) {
        for (int i = 0; i < howManyCards; i++) {
            Card newCard = Game.deckOfCards.get(i);
            playerCards.add(newCard);
            Game.deckOfCards.remove(i);
        }
        return playerCards;
    }
    public static void dealCards () {
        for (int i = 0; i <5 ; i++) {
            Game.player1.getPlayerCards().add(Game.deckOfCards.get(i));
            Game.deckOfCards.remove(i);
        }
        for (int i = 0; i < 5; i++) {
            Game.player2.getPlayerCards().add(Game.deckOfCards.get(i));
            Game.deckOfCards.remove(i);
        }
        Game.table.cardsOnTable.add(Game.deckOfCards.get(0));
        Game.deckOfCards.remove(0);
        Game.table.cardOnTable();
    }

}
