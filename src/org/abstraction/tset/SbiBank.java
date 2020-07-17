package org.abstraction.tset;

public interface SbiBank {
	
	//fully abstraction
	//no need to specify abstract. It ll automatically identified as abstract
	
	void savings();
	abstract void fixed();
	public void deposit();
	public abstract void current();
	
	
}
