import java.util.ArrayList;
import java.util.List;

public class Player {

   private List<Card> playerCards = new ArrayList<Card>();

   public String throwCard (int numberOfCard) {
       playerCards.remove(numberOfCard);
       return playerCards.get(numberOfCard).toString();
   }

   public List<Card> takeCard (int howManyCards) {
       for (int i = 0; i < howManyCards; i++) {
           Card newCard = Game.deckOfCards.get(i);
           playerCards.add(newCard);
           Game.deckOfCards.remove(i);
       }
       return playerCards;
   }



}
