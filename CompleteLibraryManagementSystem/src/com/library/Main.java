package com.library;
import com.library.model.*;
import com.library.pattern.factory.BookFactory;
import com.library.service.LibraryService;
public class Main{
 public static void main(String[] args){
   LibraryService service=new LibraryService();
   Book book=BookFactory.createBook("Clean Code","Robert Martin","ISBN1",2008);
   service.addBook(book);
   service.addPatron(new Patron("P1","Alice","Alice@test.com"));
   service.checkout("ISBN1","P1");
   System.out.println("Library Management System Started");
 }
}