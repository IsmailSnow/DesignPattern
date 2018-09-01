package com.pattern.designpatterndecorateur;

public class Coca extends Boisson {

	public Coca() {
		description = "Coca";
	}

	@Override
	public double cout() {
		return 5;
	}

}
