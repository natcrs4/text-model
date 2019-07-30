package com.crs4.sem.model;

import lombok.Data;

@Data
public class SimpleTerm implements Term{
	private String content;

	
	public SimpleTerm(String content){
		this.setContent(content);
	}
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int compareTo(Term o) {
		
		return this.content().compareTo(o.content());
	}
	public String toString(){
		return this.getContent().toString();
		
	}
	
	public String content() {
		// TODO Auto-generated method stub
		return this.getContent();
	}
	public String lemma() {
		
		return this.getContent();
	}
	public boolean isCompound() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean hasTag() {
		
		return true;
	}
	@Override
	public String tag() {
		return null;
		
	}

}
