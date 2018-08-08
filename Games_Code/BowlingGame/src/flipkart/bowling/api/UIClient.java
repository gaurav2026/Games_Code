package flipkart.bowling.api;

import java.util.List;

import flipkart.bowling.Player;

public interface UIClient {
	
	public int getNumberOfPlayers();
	
	public List<Player> getPlayerData(int n);

	public char getNextScore();
	
	public void printScope(Game g);
}
