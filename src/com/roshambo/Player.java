package com.roshambo;

public abstract class Player {

	private String name;
	private Roshambo value;
	
	public abstract Roshambo generateRoshambo();
	public abstract Roshambo generateRoshambo(String userInput);
	
	public Player () {
		super();
	}
	
	public Player(String name, Roshambo value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Roshambo getValue() {
		return value;
	}
	
	public void setValue(Roshambo value) {
		this.value = value;
	}

}
