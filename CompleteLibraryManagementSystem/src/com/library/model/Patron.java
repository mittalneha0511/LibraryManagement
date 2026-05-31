package com.library.model;
import java.util.*;
public class Patron {
    private String id,name,email;
    private List<Book> history=new ArrayList<>();
    public Patron(String id,String name,String email){this.id=id;this.name=name;this.email=email;}
    public String getId(){return id;}
    public List<Book> getHistory(){return history;}
}