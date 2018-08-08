package flipkart.bowling.api;

import java.util.List;

import flipkart.bowling.Player;

public interface Game {
	// TODO: add int getId();
	
	public boolean isGameOver();
	
	public List<Player> getPlayers();
	
	public Player whoIsPlaying();
	
	public int whichSet();
	
	public void addScore(char score);
}
