import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {
    Deck deck;
    Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.HEARTS, RankType.ACE);
    }
    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.countNumCards());
    }
    @Test
    public void canAdd52cards(){
        deck.populateDeck();
        assertEquals(52, deck.countNumCards());
    }
    @Test
    public void testShuffle(){
        deck.populateDeck();
        Card card = deck.get(0);
        deck.shuffleDeck();
        assertNotEquals(card, deck.get(0));
    }
    @Test
    public void canDealCard(){
        deck.populateDeck();
        deck.shuffleDeck();
        assertTrue(deck.dealCard() instanceof Card);

    }



}
