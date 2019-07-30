package com.crs4.sem.model;


public interface Term extends Comparable<Term>{

	
	public String content();
	
	public String lemma();
	public String tag();
	public boolean isCompound();
	public boolean hasTag();
}
