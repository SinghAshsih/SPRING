package com.spring.core.annotationbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("traveler")
public class Traveler {
	private Vechile vechile;

	@Autowired
	public Traveler(@Qualifier("bike") Vechile vechile) {
		this.vechile = vechile;
	}

	public void startJourney() {
		this.vechile.move();
	}
}
