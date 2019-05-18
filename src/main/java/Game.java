import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {

    static List<Card> deckOfCards = new ArrayList<Card>();

    static final int max = 52;
    static final int min = deckOfCards.size();

    static Player player1 = new Player(new ArrayList<Card>());
    static Player player2 = new Player(new ArrayList<Card>());
    static Table table = new Table(new ArrayList<Card>());


    public static void main(String[] args) {

        addCards();
        PlayerCards.dealCards(); // mamy dwóch playerów (każdy z listą pięciu kart) i jedną kartę na stole

        for (int i = 0; i < max; i++) {
            if (min > 0) {
                player1.playCard();
                player2.playCard();
                if (player1.getPlayerCards().size() == 0) {
                System.out.println("The winner is Player 1!!!");
                } else if (player2.getPlayerCards().size() == 0) {
                System.out.println("The winner is Player 2!!!");
            }
            } else {gameOver();}
        }
    }

    public static List<Card> addCards() {
        Color.values();
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j <= 14; j++) {
                Card cardForDeck = new Card(j, Color.values()[i]);
                deckOfCards.add(cardForDeck);
                Collections.shuffle(deckOfCards);
                Collections.shuffle(deckOfCards);
            }
        }
        return deckOfCards;
    }

    public static void gameOver() {
        System.out.println("GAME OVER");
    }

}

