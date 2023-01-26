package cardGameWar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

public List<Card> cards = new ArrayList<Card>();

// constructor creating the deck of 52
public Deck() {
	
	String [] shapes= {"spades","hearts","diamonds","clubs"};
	for(int i=2;i<=14;i++) {
		for(int j=0;j<shapes.length;j++) {
	Card newCards = new Card();	
    newCards.setName(shapes[j]);
    newCards.setValue(i);
	
		cards.add(newCards);
		}
	  }
	
	}

// shuffle method on the list of cards on the deck

public void shuffle () {
	Collections.shuffle(cards);
	
}

// draw method on the list of cards on the deck
public Card draw() {
return  cards.remove(0);
	
}

}
