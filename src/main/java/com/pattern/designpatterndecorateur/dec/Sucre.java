package com.pattern.designpatterndecorateur.dec;

import com.pattern.designpatterndecorateur.Boisson;

public class Sucre extends DecorateurBoisson {

	public Sucre(Boisson boisson) {
		super(boisson);
	}

	@Override
	public String getDescription() {
		return boisson.getDescription()+" sucré";
	}

	@Override
	public double cout() {
		return 0+boisson.cout();
	}

}
