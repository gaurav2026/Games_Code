package flipkart.bowling.impl;

import java.util.List;

import flipkart.bowling.Player;
import flipkart.bowling.api.Game;
import flipkart.bowling.api.GameState;

public class GameImpl implements Game {
	//TODO: Add id
	List<Player> players;
	int currentPlayer;
	int setBeingPlayed;
	GameState state;
	
	public GameImpl(List<Player> players) {
		this.players = players;
		currentPlayer = 1;
		setBeingPlayed = 1;
		state = GameState.INITIALIZED;
	}

	@Override
	public boolean isGameOver() {
		return state == GameState.GAMEOVER;
	}

	@Override
	public List<Player> getPlayers() {
		return players;
	}

	@Override
	public Player whoIsPlaying() {
		return players.get(currentPlayer-1);
	}

	@Override
	public int whichSet() {
		return setBeingPlayed;
	}

	@Override
	public void addScore(char score) {
		Player cp = whoIsPlaying();
		boolean setover = cp.addScore(setBeingPlayed, score);
		
		int n = players.size();
		int s = cp.getSets().size();
		if (cp == players.get(n - 1) && setover) {
			if (setBeingPlayed == 0) {
				state = GameState.GAMEOVER;
				return;
			} else if (setBeingPlayed == s) setBeingPlayed = 0;
			else setBeingPlayed++;
		}
	}
}
