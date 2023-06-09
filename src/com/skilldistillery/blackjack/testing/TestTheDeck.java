package com.skilldistillery.blackjack.testing;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Deck;

public class TestTheDeck {

	public static void main(String[] args) {
		//display each of the 52 cards in a Deck
		Deck deck = new Deck();
		System.out.println(deck.checkDeckSize());
		deck.shuffle();
		//deck shuffle
		final int initializeDeckSize = deck.checkDeckSize();
		//int initialDeckSize = deck.checkDeckSize();
		for(int cardNumber = 0; cardNumber< initializeDeckSize; cardNumber++) {
			Card card = deck.dealCard();
			
			
			System.out.println(card + " " + deck.checkDeckSize()
			);
		}
		
	
		//Card card = deck.dealCard();
		//System.out.println(card);
	

}
}