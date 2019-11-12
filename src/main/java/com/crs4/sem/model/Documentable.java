package com.crs4.sem.model;

public interface Documentable {

//public Long getId();
public String getTitle();
public String getDescription();
public String text();
public String getAuthors();
public String [] getCategories();
public void setCategories(String[] parents);
public String getUrl();

  
   
}
