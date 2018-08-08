package flipkart.bowling;

import java.util.List;

import flipkart.bowling.api.Game;
import flipkart.bowling.impl.GameImpl;

public class GameFactory {
	
	public static Game getNewGame(int numberOfPlayers, List<Player> players) {
		
		//TODO: validate players info
		
		return new GameImpl(players);
	}

}
