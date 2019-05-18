public class Card {

    // SYMBOL:
    //2 = 2
    //3 = 3
    //4 = 4
    //5 = 5
    //6 = 6
    //7 = 7
    //8 = 8
    //9 = 9
    //10 = 10
    //11 = J
    //12 = D
    //13 = K
    //14 = As

    private int symbol;
    private Color color;

    public Card(int symbol, Color color) {
        this.symbol = symbol;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Card{" +
                "symbol=" + symbol +
                ", color=" + color +
                '}';
    }

    public int getSymbol() {
        return symbol;
    }

    public void setSymbol(int symbol) {
        this.symbol = symbol;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
