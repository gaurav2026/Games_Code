package flipkart.bowling.impl;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import flipkart.bowling.Player;
import flipkart.bowling.api.Game;
import flipkart.bowling.api.UIClient;

public class UIClientImpl implements UIClient {

	Scanner sc = new Scanner(System.in);
	PrintStream pw = System.out;
	
	@Override
	public int getNumberOfPlayers() {
		pw.println("Number of Players: ");
		return sc.nextInt();
	}

	@Override
	public List<Player> getPlayerData(int n) {
		List<Player> pl = new ArrayList<Player>(n);
		
		for (int i=1;i<=n;i++) {
			pl.add(new Player(i, ""));
		}

		return pl;
	}

	@Override
	public char getNextScore() {
		if (sc.hasNext()) {
			String s = sc.next();
			return s.charAt(0);
		}
		return 0;
	}

	@Override
	public void printScope(Game g) {
		pw.println("GoodGoing");
	}
}
