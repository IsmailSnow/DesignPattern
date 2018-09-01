package com.pattern.designpatterndecorateur.dec;

import com.pattern.designpatterndecorateur.Boisson;

public class Lait extends DecorateurBoisson {

	public Lait(Boisson boisson) {
		super(boisson);
	}

	@Override
	public double cout() {
		return 2+boisson.cout();
	}

	@Override
	public String getDescription() {
		return boisson.getDescription()+" au Lait ";
	}

}
