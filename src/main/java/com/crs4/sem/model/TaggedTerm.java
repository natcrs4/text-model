package com.crs4.sem.model;

import lombok.Data;

@Data
public class TaggedTerm implements Term {

	private Term term;
	private Tag tag;
	

	public String content() {
		return term.content() ;
	}



	public int compareTo(Term o) {

		return this.content().compareTo(o.content());
	}

	public boolean isXMLTag() {
		return getTag().equals("XML");
	}

	public TaggedTerm(String taggedTerm) {
		String[] sp = taggedTerm.split("/");
		this.setTerm(new SimpleTerm(sp[0]));
		this.setTag(new Tag(sp[1]));
	}

	public TaggedTerm(String term, String tag) {
		this.setTerm(new SimpleTerm(term));
		this.setTag(new Tag(tag));
	}

	public TaggedTerm(String term, Tag tag) {
		this.setTerm(new SimpleTerm(term));
		this.setTag(tag);
	}
	
	public TaggedTerm(String[] tokens) {
		this.setTag(new Tag(tokens[1]));
		this.setTerm(new SimpleTerm(tokens[0]));
	}
//	public TaggedTerm(String[] tokens) {
//		if(tokens.length==3){
//		this.setTag(new Tag(tokens[1]));
//		this.setTerm(new LemmaTerm(tokens[0], tokens[0]));
//		}
//		else {
//			this.setTag(new Tag(tokens[1]));
//			this.setTerm(new SimpleTerm(tokens[0]));
//			}
//		}

	public TaggedTerm(Term simpleTerm, Tag tag) {
		this.setTag(tag);
		this.setTerm(simpleTerm);
	}



	public String toString() {
		return this.content();
	}

	public boolean isNoun() {
		return POSIdentifier.isNoun(this.getTag());
	}

	public boolean isAdjective() {
		return POSIdentifier.isAdjective(this.getTag());
	}

	public boolean isProperNoun() {
		return POSIdentifier.isProperNoun(this.getTag());
	}

	public boolean isAdverb() {
		return POSIdentifier.isAdverb(this.getTag());
	}

	public boolean isVerb() {
		
		return POSIdentifier.isVerb(this.getTag());
	}
	
	public String lemma() {
		return this.getTerm().lemma();
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
		return this.getTag().toString();
		
	}
}
