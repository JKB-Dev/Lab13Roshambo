package com.roshambo;

public class User extends Player {

	public User() {
		super();
	}
	
	@Override
	public Roshambo generateRoshambo(String userInput) {
		switch(userInput) {
		case "R":
		case "r":
			return Roshambo.ROCK;
		case "P":
		case "p":
			return Roshambo.PAPER;
		case "S":
		case "s":
			return Roshambo.SCISSORS;
		}
		return null;
	}

	@Override
	public Roshambo generateRoshambo() {
		return null;
	}

}
