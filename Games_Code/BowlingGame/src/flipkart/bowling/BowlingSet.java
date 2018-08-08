package flipkart.bowling;

public class BowlingSet {
	char score1;
	char score2;
	int bonus;
	boolean setComplete;
	
	public BowlingSet() {
		score1 = '-';
		score2 = '-';
		bonus = 0;
		setComplete = false;
	} 

	public boolean addScore(char s) {
		if (score1 == '-') {
			score1 = s;
			if (score1 == 'X') {
				bonus = 10;
				setComplete = true;
			}
			return setComplete;
		}
		
		score2 = s;
		if (score2 == '/') {
			bonus = 5;
		}
		
		setComplete = true;
		return setComplete;
	}
	
	public int getTotalScore() {
		int s = 0;
		if (score1 == 'X') s += 10;
		else s += (s - '0');
		
		if (score2 == '/') s = 10;
		else if (score2 != '-') s += (s - '0');
		
		s += bonus;
		return s;
	}
}
