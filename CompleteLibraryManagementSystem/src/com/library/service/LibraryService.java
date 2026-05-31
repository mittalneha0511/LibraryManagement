package com.library.service;
import com.library.model.*;
import java.util.*;
import java.util.logging.Logger;
public class LibraryService{
 private static final Logger log=Logger.getLogger("Library");
 private Map<String,Book> books=new HashMap<>();
 private Map<String,Patron> patrons=new HashMap<>();
 public void addBook(Book b){books.put(b.getIsbn(),b);log.info("Book added");}
 public void updateBook(Book b){books.put(b.getIsbn(),b);}
 public void removeBook(String isbn){books.remove(isbn);}
 public Book searchByISBN(String isbn){return books.get(isbn);}
 public void addPatron(Patron p){patrons.put(p.getId(),p);}
 public void checkout(String isbn,String patronId){
   Book b=books.get(isbn);
   if(b!=null&&b.isAvailable()){b.setAvailable(false);}
 }
 public void returnBook(String isbn){
   if(books.containsKey(isbn)) books.get(isbn).setAvailable(true);
 }
}