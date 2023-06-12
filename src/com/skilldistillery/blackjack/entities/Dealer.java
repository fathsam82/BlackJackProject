package com.skilldistillery.blackjack.entities;

import java.util.List;

public class Dealer extends Player {
	private Deck deck = new Deck();

	public void shuffle() {
		deck.shuffle();
	}

	public Card dealCard() {

		Card card = deck.dealCard();
		return card;
	}

	public void visibleCards() {
		System.out.println(
				"dealer shows first card " + hand.getHand().get(1) + "\nvalue: " + hand.getHand().get(1).getValue());

	}

}
