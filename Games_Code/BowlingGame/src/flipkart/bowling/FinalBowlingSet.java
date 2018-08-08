package flipkart.bowling;

public class FinalBowlingSet extends BowlingSet {
	char score3;
	
	public FinalBowlingSet() {
		super();
		score3 = '-';
	}

	public boolean addScore(char s) {
		if (score1 == '-') {
			score1 = s;
			if (score1 == 'X') {
				bonus = 10;
			}
			return setComplete;
		}
		
		if (score1 != '-' && score2 == '-') {
			score2 = s;
			
			if (score2 != 'X' && score2 != '/') setComplete = true;
			else if (score2 == 'X') bonus += 10;
			else if (score2 == '/') bonus += 5;
			
			return setComplete;
		} 
		
		if ((score1 == 'X' && score2 != 'X') || score2 == '/') {
			score3 = s;
			if (score3 == 'X') {
				bonus += 10;
			}
			setComplete = true;
			return setComplete;
		}
		
		return score2 == 'X';
	}
	
	public int getTotalScore() {
		int s = 0;
		if (score1 == 'X') s += 10;
		else s += (score1 - '0');
		
		if (score2 == '/') s = 10;
		else if (score2 == 'X') s += 10;
		else s += (score2 - '0');
		
		if (score3 == 'X') s += 10;
		else s += (score3 - '0');
		
		s += bonus;
		return s;
	}
}
