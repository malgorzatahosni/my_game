import java.util.ArrayList;
import java.util.List;

public class Game {

    static List<Card> deckOfCards = new ArrayList<Card>();

    static final int max = 52;
    static final int min = deckOfCards.size();


    public static void main(String[] args) {

        addCards();

        if (min < 1) {
            gameOver();
        }
    }

    public static List<Card> addCards() {
        Color.values();
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j <= 14; j++) {
                Card cardForDeck = new Card(j, Color.values()[i]);
                deckOfCards.add(cardForDeck);
            }
        }
        return deckOfCards;
    }

    public static void gameOver() {
        System.out.println("GAME OVER");
    }
}

