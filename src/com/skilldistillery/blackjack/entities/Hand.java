package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	protected List<Card> hand = new ArrayList<>();

	public abstract int getHandValue();

	Hand() {

	}

	public void addCard(Card card) {
		hand.add(card);

	}

	public void clear() {
		hand.clear();

	}

	@Override
	public String toString() {
		return "Hand = " + hand + "";
	}

	public List<Card> getHand() {
		return hand;
	}

}