package com.spring.core.loosely.coupled;

public class Client {
	public static void main(String[] args) {
		Vechile vechile = new Cycle();
		Traveler traveler = new Traveler(vechile);
		traveler.startJourney();
	}
}
