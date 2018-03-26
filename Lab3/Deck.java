package com.tasks3.carddeck;
public class Deck {
    Card[] deck;
    int index;
    
    public Deck(){
        index = 35;
		int i = -1;
		this.deck = new Card[Suit.values.length * Rank.values.length];
	    for (Suit suit: Suit.values) {
	        for (Rank rank: Rank.values) {
	            deck[++i] = new Card(rank,suit);
	        }
	    }
	}
    
	public void shuffle() {
        Card tmpCard;
        int q = (int) (Math.random()*300+700);
        for (int n=0; n<q; n++){
            int l = (int) (Math.random()*32);
            int m = (int) (Math.random()*(36-l)+l);
            tmpCard = this.deck[m];
            this.deck[m] = this.deck[m-l];
            this.deck[m-l] = tmpCard;
            }
    }

    public void order() {
        index = 35;
            int i = -1;
            this.deck = new Card[Suit.values.length * Rank.values.length];
            for (Suit suit: Suit.values) {
                for (Rank rank: Rank.values) {
                    deck[++i] = new Card(rank,suit);
                }
            }
    }
    
    public boolean hasNext() {
    return index > -1;
    }

    public Card drawOne() {
    if (index >= 0)
        return this.deck[index--];
    else return null;
    } 
}