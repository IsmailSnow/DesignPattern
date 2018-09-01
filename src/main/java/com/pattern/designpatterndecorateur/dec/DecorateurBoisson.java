package com.pattern.designpatterndecorateur.dec;

import com.pattern.designpatterndecorateur.Boisson;
public abstract class DecorateurBoisson extends Boisson {

	protected Boisson boisson;

	public DecorateurBoisson(Boisson boisson) {
		super();
		this.boisson = boisson;
	}
	
	public abstract String getDescription();
}
