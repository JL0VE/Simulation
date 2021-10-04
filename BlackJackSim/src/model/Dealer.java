package model;

public class Dealer {

	private int score;
	
	public Dealer() {
		score = 0;
	}
	
	public boolean add(int hit) {
		score += hit;
		return score <= 21;
	}
	
	public int getScore() {
		return score;
	}
}
