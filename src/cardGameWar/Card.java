package cardGameWar;

public class Card {
private	int value;
private String name;
	
public Card(int value, String name) {
	this.name=name;
	this.value= value;
}
public Card() {
	// TODO Auto-generated constructor stub
	
}
// creating the getters and setters
public void setValue( int value) {
	this.value = value;
}
public int getValue(){
	return value;
}
public void setName(String name){
	this.name = name;
}

public String getName() {
	return name;
}

// describe method for displaying card name and value
public String describe () {
	return name + ": " + value;
}

}
