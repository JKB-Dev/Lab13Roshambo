package com.roshambo;

public class Dummy extends Player {
	
	public Dummy() {
		super();
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

	@Override
	public Roshambo generateRoshambo(String userInput) {
		// TODO Auto-generated method stub
		return null;
	}

}
