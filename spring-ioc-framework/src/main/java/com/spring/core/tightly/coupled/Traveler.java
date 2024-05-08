package com.spring.core.tightly.coupled;

public class Traveler {

	Cycle cycle = null;

	public Traveler() {
		this.cycle = new Cycle();
	}

	public void startJourney() {
		this.cycle.move();
	}
	// Car car = null;
	//
	// public Traveler() {
	// this.car = new Car();
	// }
	//
	// public void startJourney() {
	// this.car.move();
	// }

	// Bike bike = null;
	//
	// public Traveler() {
	// this.bike = new Bike();
	// }
	//
	// public void startJourney() {
	// this.bike.move();
	// }

}
