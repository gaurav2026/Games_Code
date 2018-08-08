package flipkart.bowling;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	int playerNo;
	
	String name;
	
	List<BowlingSet> sets;

	FinalBowlingSet finalSet;
	
	public Player(int no, String name) {
		playerNo = no;
		this.name = name;
		
		sets = new ArrayList<BowlingSet>(9);
		
		for (int i=0;i<9;i++) sets.add(new BowlingSet());
		
		finalSet = new FinalBowlingSet();
	}
	
	public int getPlayerNo() {
		return playerNo;
	}
	
	public String getPlayerName() {
		return name;
	}
	
	public List<BowlingSet> getSets() {
		return sets;
	}
	
	public FinalBowlingSet getFinalSet() {
		return finalSet;
	}
	
	public boolean addScore(int set, char score) {
		// Consider 0 means final set
		if (set > 0) {
			BowlingSet bset = sets.get(set - 1);
			return bset.addScore(score);
		} else if (set == 0){
			return finalSet.addScore(score);
		} else return true;
	}
}
