import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    @Test
    public void SizeDeckOfCards() {
        Game.addCards();
        assertThat(Game.deckOfCards.size()).isEqualTo(52);
    }
}
