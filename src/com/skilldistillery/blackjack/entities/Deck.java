package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> deck = new ArrayList<>();

	public Deck() {
		createDeckOfCards();
	}

	public void createDeckOfCards() {
		Suit[] suits = Suit.values();
		Rank[] ranks = Rank.values();

		for (Suit suit : suits) {
			for (Rank rank : ranks) {
				Card aCard = new Card(suit, rank);
				deck.add(aCard);

			}
		}
	}

	public int checkDeckSize() {
		return deck.size();

	}

	public Card dealCard() {
		Card aCard = null;
		aCard = deck.remove(0);
		return aCard;

	}

	public void dealCardToHand(Hand hand) {

	}

	public void shuffle() {
		Collections.shuffle(deck);
	}

}
