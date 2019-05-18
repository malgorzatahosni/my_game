import java.util.ArrayList;
import java.util.List;

public class Table {

    public List<Card> cardsOnTable;

    public Table(List<Card> cardsOnTable) {
        this.cardsOnTable = cardsOnTable;
    }

    public Card cardOnTable () {
        Card cardOnTable = cardsOnTable.get(cardsOnTable.lastIndexOf(cardsOnTable));
        cardOnTable.toString();
        return cardOnTable();
    }



}
