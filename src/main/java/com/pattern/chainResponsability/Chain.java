package com.pattern.chainResponsability;

import com.pattern.chainResponsability.entities.Numbers;

public interface Chain {
	
	
	public void setNetChain(Chain nextChain);
	public void calculate(Numbers numbers);

}
