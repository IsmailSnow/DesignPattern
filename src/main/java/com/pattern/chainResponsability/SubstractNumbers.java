package com.pattern.chainResponsability;

import com.pattern.chainResponsability.entities.Numbers;

public class SubstractNumbers implements Chain{
	
	private Chain nextInChain;

	@Override
	public void setNetChain(Chain nextChain) {
	  this.nextInChain=nextChain;
		
	}

	@Override
	public void calculate(Numbers request) {
		if(request.getCalculationWanted()=="sub") {
			System.out.println(request.getNumber1()+"-"+request.getNumber2()+"="+Math.subtractExact(request.getNumber1(), request.getNumber2()));
		}else {
			nextInChain.calculate(request);
		}
		
	}

}
