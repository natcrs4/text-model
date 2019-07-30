package com.crs4.sem.model;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Tag {
    private String abbr;
    public String toString(){
    	return abbr;
    }
    
    public Tag(String abbr){
    	this.setAbbr(abbr);
    }
	public static final Tag NOUN = new Tag("NOUN");
	public static final Tag VERB = new Tag("VERB");
	public static final Tag ADJECTIVE = new Tag("ADJECTIVE");
	public static final Tag ADVERB = new Tag("ADVERB");
   
	
	public boolean equals(Object obj) {
		
		if (obj instanceof Tag) {
			Tag pos = (Tag) obj;
			return this.getAbbr().equals(pos.getAbbr());
		}
		return false;
	}
	public int hashCode(){
		return this.getAbbr().hashCode();
	}
}
