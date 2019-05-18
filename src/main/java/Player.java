
import java.util.List;

public class Player  {

    private List<Card> playerCards;

    public Player(List<Card> playerCards) {
        this.playerCards = playerCards;
    }

    public List<Card> getPlayerCards() {
        return playerCards;
    }

    public void setPlayerCards(List<Card> playerCards) {
        this.playerCards = playerCards;
    }

    public void playCard () {
        if (Game.table.cardOnTable().getSymbol() > 4 || Game.table.cardOnTable().getSymbol() < 11
                || Game.table.cardOnTable().getSymbol() == 12 ||
                (Game.table.cardOnTable().getSymbol() == 13 && Game.table.cardOnTable().getColor() == Color.KARO)
                || (Game.table.cardOnTable().getSymbol() == 13 && Game.table.cardOnTable().getColor() == Color.TREFL)) {
        for (int i = 0; i < playerCards.size(); i++) {
            if (playerCards.get(i).getColor() != Game.table.cardOnTable().getColor()
                    && playerCards.get(i).getSymbol() != Game.table.cardOnTable().getSymbol()) {
                PlayerCards.takeCard(1);
            } else {
                PlayerCards.throwCard(i);
            }
        }
        }
        else if (Game.table.cardOnTable().getSymbol() == 11) {

        }
        else {useValiantCards();
        }
    }


    public void useValiantCards () {
        switch (Game.table.cardOnTable().getSymbol()) {
            case 2:
                for (int i = 0; i < playerCards.size(); i++) {
                    if (playerCards.get(i).getSymbol() == 2) {
                        PlayerCards.throwCard(i);
                    } else {
                        PlayerCards.takeCard(2);
                    }
                }
                break;
            case 3:
                for (int i = 0; i < playerCards.size(); i++) {
                    if (playerCards.get(i).getSymbol() == 3) {
                        PlayerCards.throwCard(i);
                    } else {
                        PlayerCards.takeCard(3);
                    }
                }
                break;
            case 4:
                for (int i = 0; i < playerCards.size(); i++) {
                    if (playerCards.get(i).getSymbol() == 4) {
                        PlayerCards.throwCard(i);
                    }
                }
                break;
            case 13:
                for (int i = 0; i < playerCards.size(); i++) {
                    if (playerCards.get(i).getSymbol() == 13 &&
                            (playerCards.get(i).getColor() == Color.PIK || playerCards.get(i).getColor() == Color.KIER)) {
                        PlayerCards.throwCard(i);
                    } else {
                        PlayerCards.takeCard(5);
                    }
                }
                break;
        }
    }
}
