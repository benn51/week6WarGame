package cardGameWar;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instantiating the deck object and the two players
		Deck deck = new Deck();
		Player player1= new Player("mike");
		
		Player player2= new Player("luke");
		
		// shuffling the deck for each game
		deck.shuffle();
		
	
		//  giving 26 cards for each players
		for(int i=0;i<26;i++) {
			player1.draw(deck);
		}
		for(int i=0;i<26;i++) {
			player2.draw(deck);
			
		}
		
	// calling the flip method for each player and storing the result in to a variable.	
		
	 for(int i=0;i<26;i++) {
			int player1Card=0;
			player1Card= player1.flip().getValue();
			int player2Card=0;
			player2Card=player2.flip().getValue();
			if(player1Card > player2Card) {
				player1.increment();
			}
			if(player2Card > player1Card) {
				player2.increment();
			}
				
		}
	
		// comparing the scores at the end of flipping the card
		if(player1.score > player2.score) {
			
			System.out.println("player " + player1.name + " has won the game");
		}
		else if(player2.score > player1.score) {
			
			System.out.println("player " + player2.name + " has won the game");
		}
		else {
			    System.out.println("         this game was a draw");
				System.out.println("         **** play Again *****");
		}
		
		// calling the describe method to display the names of the players with their scores
		player1.describe();
		player2.describe();

	
		
	
		
		
		
	}

}
