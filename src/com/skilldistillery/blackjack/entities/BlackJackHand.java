package com.skilldistillery.blackjack.entities;

public class BlackJackHand extends Hand {

	@Override
	public int getHandValue() {
		// look at each card in hand and add the cards value
		int sum = 0;
		for (Card cardInHand : hand) {
			sum += cardInHand.getValue();

		}

		return sum;

	}

	public boolean isBlackjack() {
		return false;

	}

	public boolean isBust() {
		return false;
	}

}
