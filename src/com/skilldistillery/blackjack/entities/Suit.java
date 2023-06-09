package com.skilldistillery.blackjack.entities;

public enum Suit {
	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");

	private final String suitOfCard;

	private Suit(String politeSuit) {
		suitOfCard = politeSuit;

	}

	@Override
	public String toString() {
		return suitOfCard;
	}

}
