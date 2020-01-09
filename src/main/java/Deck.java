import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Random;

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
    shuffle(deck);
    }

    public Card get(int i) {
        return this.deck.get(i);
    }

    public Card dealCard() {
        int number = new Random().nextInt(53);
        return this.deck.get(number);
    }
    }


