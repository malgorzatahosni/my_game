public class Card {

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
