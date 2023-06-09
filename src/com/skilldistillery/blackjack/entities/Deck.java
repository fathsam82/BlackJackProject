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
		// for each suit(dia, heart, clubs, spade)
		// create 13 ranked (2-> Ace)
		// create a Card

		for (Suit suit : suits) { // 4 suits
			for (Rank rank : ranks) { // 13 ranks
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
		//remove a card from the deck
		aCard = deck.remove(0);
		return aCard;

	}

	public void shuffle() {
		Collections.shuffle(deck);
	}

}
