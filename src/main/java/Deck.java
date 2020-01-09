import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.*;

public class Deck {
    private ArrayList<Card> deck;
    private ArrayList<Card> shuffdeck;
    private SuitType suits;
    private RankType ranks;

    public Deck(){
        deck = new ArrayList<Card>();


    }
    public int countNumCards() {
        return this.deck.size();
    }
    public void populateDeck(){
        for (SuitType suit : SuitType.values()){
            for (RankType rank : RankType.values()){
                Card card = new Card(suit,rank);
                deck.add(card);
            }
        }
    }
    public void shuffleDeck(){
      shuffdeck = new ArrayList<Card>(shuffle(deck));

     this.deck = shuffle(deck);
    }
}
