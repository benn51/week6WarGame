package cardGameWar;

import java.util.ArrayList;
import java.util.List;

public class Player {
   public List <Card> hand= new ArrayList<Card>();
   public int score;
   public String name;
   
   public Player (String name) {
	     this.name= name;
   }
   
   
   // describe method displaying the player name and the card
   
   public void describe () {
	  
	   System.out.println("\nPlayer " + name + " " + "has " + score + " points!\n");
	   for(Card playerCard:hand) {
		  playerCard.describe();
	   }
	   System.out.println("*****************************************");
	   
   }
   // flip method to flip the card that is on the player hand
   
   public Card flip() {
	   return hand.remove(0);
   }
   // draw method to draw card from deck
   
   public void draw(Deck thisDeck) {
	   hand.add(thisDeck.draw());
   }
   // increment method to increment the score
   
   public void increment() {
	   score ++;
   }
}
