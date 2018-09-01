package com.pattern.designpatternAbstractFactofy.abstractFactory.impl;

import com.pattern.designpatternAbstractFactofy.abstractFactory.AbstractFactory;
import com.pattern.designpatternAbstractFactofy.abstractFactory.AbstractPlugin;

public class AbstractFactoryImpl2 implements AbstractFactory {

	@Override
	public AbstractPlugin getinstance() {
		// TODO Auto-generated method stub
		return new AbstractPulginImpl2();
	}

}
