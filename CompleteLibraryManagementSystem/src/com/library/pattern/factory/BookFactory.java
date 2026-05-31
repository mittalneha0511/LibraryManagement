package com.library.pattern.factory;
import com.library.model.Book;
public class BookFactory{
 public static Book createBook(String t,String a,String i,int y){
   return new Book(t,a,i,y);
 }
}