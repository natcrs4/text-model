package com.crs4.sem.model;

import java.util.ArrayList;
import java.util.List;


import lombok.Data;
@Data
public class CompoundTaggedTerm implements Term{
    private List<Term> terms;
    private Tag tag;
    public CompoundTaggedTerm(){
    	this.setTerms(new ArrayList<Term>());
    }
    
    public CompoundTaggedTerm(String taggedWords){
    	this.setTerms(this.parse(taggedWords));
    }
    public CompoundTaggedTerm(List<Term> terms2, Tag tag) {
		this.setTerms(terms2);
		this.tag=tag;
	}

	public List<Term> parse(String taggedWords){
    	String[] spl = taggedWords.split(" ");
    	List<Term> terms=new ArrayList<Term>();
    	for(String t:spl){
    		Term term= new TaggedTerm(t);
    		terms.add(term);
    	}
    	return terms;
    }

	public String content() {
		StringBuilder builder= new StringBuilder();
		for(Term t:this.getTerms()){
			 builder.append(t.content());
			 builder.append(" ");
		}	
		return builder.toString().trim();
	}
	public int compareTo(Term o) {

		return this.content().compareTo(o.content());
	}
	public String toString(){
		return this.content();
	}

	public String lemma() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isCompound() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean hasTag() {
		
		return true;
	}

	@Override
	public String tag() {
		return this.getTag().toString();
		
	}
}
