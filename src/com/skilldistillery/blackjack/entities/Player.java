package com.skilldistillery.blackjack.entities;

public class Player {
	protected Hand hand = new BlackJackHand();

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public void addCardToHand(Card card) {
		hand.addCard(card);
	}
}