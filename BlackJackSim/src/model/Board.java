package model;

import java.util.Random;

public class Board {

	//Number Generator
	private Random cardGen;
	//User
	private User aUser;
	//Dealer
	private Dealer aDealer;
	//False = Dealer
	private boolean turn;
	//Pot
	private long pot;
	
	public Board() {
		cardGen = new Random();
		aUser = new User();
		aDealer = new Dealer();
		turn = false;
		pot = 0;
	}
	
	public User getUser() {
		return aUser;
	}
	
	public Dealer getDealer() {
		return aDealer;
	}
	
	public long getPot() {
		return pot;
	}
	
	public boolean getTurn() {
		return turn;
	}

	public void setaUser(User aUser) {
		this.aUser = aUser;
	}

	public void setaDealer(Dealer aDealer) {
		this.aDealer = aDealer;
	}

	public void setTurn(boolean turn) {
		this.turn = turn;
	}

	public void setPot(long pot) {
		this.pot = pot;
	}
}
