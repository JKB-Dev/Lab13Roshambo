package com.roshambo;
import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Player human = new User();
		Player computer = null;
		String userName;
		String userChoice;
		String userInput;
		Roshambo value = null;
		Roshambo userValue = null;

		String cont = "y";

		System.out.println();

		// get user name
		userName = Validator.getString(scan, "Please enter your name: ");
		human.setName(userName);

		// set loop condition
		while (cont.equalsIgnoreCase("y")) {

			// get user's choice of opponent
			userChoice = Validator.binaryString(scan, "Would you like to play against TheJets or TheSharks: (j/s): ",
					"j", "s");
			// Roshambo computerChoice;

			userInput = Validator.getString(scan, "Would you like to choose Rock, Paper, or Scissors? (r/p/s): ");
			if (userChoice.equalsIgnoreCase("j")) {
				computer = new Dummy();
				computer.setName("TheJets");
				value = computer.generateRoshambo();
				System.out.println("TheJets chose " + value);
			} else if (userChoice.equalsIgnoreCase("s")) {
				computer = new RandomUser();
				computer.setName("TheSharks");
				value = computer.generateRoshambo();
				System.out.println("TheSharks chose " + value);
			} else {
				System.out.println();
			}

			userValue = human.generateRoshambo(userInput);
			System.out.println(userName + " chose " + userValue);
			System.out.println(displayResults(computer, human, userValue, value));

			System.out.println("Would you like to play again? (y/n): ");
			cont = scan.nextLine();
		}

		System.out.println("Goodbye!");
		scan.close();
	}

	public static String displayResults(Player computer, Player human, Roshambo userValue, Roshambo value) {

		
		String results = "";

		if (userValue == value) {
			results = "It's a draw";

		}

		else if (userValue == Roshambo.ROCK && value == Roshambo.PAPER
				|| userValue == Roshambo.PAPER && value == Roshambo.SCISSORS
				|| userValue == Roshambo.SCISSORS && value == Roshambo.ROCK) {
			results = computer.getName() + " win!";
		}

		else {
			results = human.getName() + " wins!";
		}

		return results;
	}

}
