package com.rpiquer.persistence.impl;

import com.rpiquer.persistence.BookRepository;
import com.rpiquer.persistence.EnumBookRepository;

import java.util.ArrayList;
import java.util.List;

import com.rpiquer.business.entity.*;

public class EnumBookRepositoryImpl implements BookRepository{
    List<Book> books = new ArrayList<Book>();
    Book libro1 = new Book(EnumBookRepository.LIBRO1.getId(), EnumBookRepository.LIBRO1.getTitle(), EnumBookRepository.LIBRO1.getAuthor());
    Book libro2 = new Book(EnumBookRepository.LIBRO2.getId(), EnumBookRepository.LIBRO2.getTitle(), EnumBookRepository.LIBRO2.getAuthor());
    Book libro3 = new Book(EnumBookRepository.LIBRO3.getId(), EnumBookRepository.LIBRO3.getTitle(), EnumBookRepository.LIBRO3.getAuthor());
    
    public List<Book> all(){
        books.add(libro1);
        books.add(libro2);
        books.add(libro3);
        return books;
    }
    
}
