package com.library.pattern.strategy;
import com.library.model.Book;
import java.util.*;
import java.util.stream.Collectors;
public class TitleSearch implements SearchStrategy{
 public List<Book> search(List<Book> books,String k){
   return books.stream().filter(b->b.getTitle().toLowerCase().contains(k.toLowerCase())).collect(Collectors.toList());
 }
}