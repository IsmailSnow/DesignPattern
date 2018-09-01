package com.pattern.designpatterndecorateur.dec;

import com.pattern.designpatterndecorateur.Boisson;

public class Chocolat extends DecorateurBoisson {

	public Chocolat(Boisson boisson) {
		super(boisson);
	}

	@Override
	public String getDescription() {
		return boisson.getDescription() + " au chocolat";
	}

	@Override
	public double cout() {
		return 1.5 + boisson.cout();
	}

}
