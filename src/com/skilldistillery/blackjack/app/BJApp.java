package com.skilldistillery.blackjack.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.blackjack.entities.BlackJackHand;
import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Hand;
import com.skilldistillery.blackjack.entities.Player;

public class BJApp {
	private Dealer dealer = new Dealer();
	private Player player = new Player();
	private Scanner sc = new Scanner(System.in);
	boolean running = true;

	public static void main(String[] args) {
		BJApp bj = new BJApp();
		bj.run();
	}

	public void run() {
		while (running) {
			player.getHand().clear();
			dealer.getHand().clear();
			System.out.println("Please enter \"play\" to keep playing or \"quit\" to quit");
			String userChoice = sc.nextLine();
			if (userChoice.equalsIgnoreCase("play")) {
				initialDeal();
				playersTurn();
				dealersTurn();
				results();

			}

			else if (userChoice.equalsIgnoreCase("quit")) {
				System.out.println("Good game, thanks for playing");
				running = false;
			}

		}

	}

	public void initialDeal() {
		dealer.shuffle();

		player.addCardToHand(dealer.dealCard());
		System.out.println("Players' " + player.getHand());

		dealer.addCardToHand(dealer.dealCard());
		System.out.println("Dealer deals themselves a facedown card");

		player.addCardToHand(dealer.dealCard());
		System.out.println("Players' " + player.getHand());

		dealer.addCardToHand(dealer.dealCard());
		System.out.println("Dealer has a hidden card");
		dealer.visibleCards();
		System.out.println("Players' " + player.getHand() + "\nvalue: " + player.getHand().getHandValue());
		player.getHand();

	}

	public void playersTurn() {
		while (player.getHand().getHandValue() < 21) {
			System.out.println("Please enter: hit or stand based on your hand");
			String userInput = sc.nextLine();
			if (userInput.equalsIgnoreCase("hit")) {
				player.addCardToHand(dealer.dealCard());
				System.out.println("Players' " + player.getHand() + "\nvalue: " + player.getHand().getHandValue());

			} else if (userInput.equalsIgnoreCase("stand")) {
				break;
			}

		}

	}

	public void dealersTurn() {
		boolean running = true;
		while (running) {
			System.out.println("Dealers' " + dealer.getHand() + "\nvalue: " + dealer.getHand().getHandValue());
			if (dealer.getHand().getHandValue() < 17) {
				dealer.addCardToHand(dealer.dealCard());
			} else {
				running = false;
			}

		}
	}

	public void results() {
		if (dealer.getHand().getHandValue() > 21) {
			System.out.println("Dealer bust, you win!");
		} else if (player.getHand().getHandValue() > 21) {
			System.out.println("You bust, the dealer wins!");
		}

		else if (dealer.getHand().getHandValue() == (player.getHand().getHandValue())) {
			System.out.println("It's a push");

		} else if ((dealer.getHand().getHandValue() > (player.getHand().getHandValue()))
				&& dealer.getHand().getHandValue() <= 21) {
			System.out.println("The dealer wins!");

		} else if (player.getHand().getHandValue() > (dealer.getHand().getHandValue())
				&& player.getHand().getHandValue() <= 21) {
			System.out.println("You win!");
		}
	}
}
