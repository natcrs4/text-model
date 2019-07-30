package com.crs4.sem.model;

import org.apache.commons.lang.ArrayUtils;

import com.crs4.sem.exceptions.POSNotFoundException;



public class POSIdentifier {
	public enum POSType {
		NOUN,ADJECTIVE,VERB,ADVERB
		}
	public static String[] NOUN_TAGS = { "NOUN","NN", "NNS" ,"noun" };
	public static String[] ADJECTIVES_TAGS = { "ADJECTIVE","JJ", "JJR", "JJS" ,"ADJ"};
	public static String[] VERBS_TAGS = { "VERB","VB", "VBD", "VBG", "VBN", "VBP", "VBZ" };
	public static String[] ADVERBS_TAGS = { "ADVERB","RB", "RBR", "RBS"};
	public static String[] PROPER_NOUN_TAGS = { "NP", "NPS" };
	
	public static boolean isNoun(Tag tag) {
		return ArrayUtils.contains(NOUN_TAGS, tag.toString());
	}

	public static boolean  isAdjective(Tag tag) {
		return ArrayUtils.contains(ADJECTIVES_TAGS, tag.toString());
	}

	public static boolean isProperNoun(Tag tag) {
		return ArrayUtils.contains(PROPER_NOUN_TAGS, tag.toString());
	}

	public static boolean isAdverb(Tag tag) {
		return ArrayUtils.contains(ADVERBS_TAGS, tag.toString());
	}

	public static boolean isVerb(Tag tag) {
		return ArrayUtils.contains(VERBS_TAGS, tag.toString());
	}
    public static Tag getEquivalent(Tag tag) throws POSNotFoundException{
    	if ( isNoun(tag)) return new Tag(NOUN_TAGS[0]);
    	if ( isAdjective(tag)) return new Tag(ADJECTIVES_TAGS[0]);
    	if ( isAdverb(tag)) return new Tag(ADVERBS_TAGS[0]);
    	if ( isVerb(tag)) return new Tag(VERBS_TAGS[0]);
    	if ( isProperNoun(tag)) return new Tag(PROPER_NOUN_TAGS[0]);
    	throw new POSNotFoundException();
    }
    public static Tag getEquivalent(String tagstring) throws POSNotFoundException{
    	return getEquivalent( new Tag(tagstring));
    }
	 
}

