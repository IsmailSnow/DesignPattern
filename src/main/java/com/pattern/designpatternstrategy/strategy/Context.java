package com.pattern.designpatternstrategy.strategy;

public class Context {
	
	
	protected Strategy strategy;

	public void appliquerStrategy() {
		strategy.OperationStrategy();
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

}
