package com.spring.core;

public class Traveler {
	private Vechile vechile;

	public Traveler(Vechile vechile) {
		this.vechile = vechile;
	}

	public void startJourney() {
		this.vechile.move();
	}
}
