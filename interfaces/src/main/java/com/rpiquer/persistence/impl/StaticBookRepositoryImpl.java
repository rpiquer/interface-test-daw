package com.rpiquer.persistence.impl;

import com.rpiquer.persistence.*;
import java.util.ArrayList;
import java.util.List;
import com.rpiquer.business.entity.*;


public class StaticBookRepositoryImpl implements BookRepository {
    Book libro1 = new Book(1, "El nombre de la rosa", "Umberto Eco");
    Book libro2 = new Book(2, "La insoportable levedad del ser", "Milan Kundera");
    Book libro3 = new Book(3, "1Q84", "Haruki Murakami");
    List<Book> books = new ArrayList<Book>();

    public List<Book> all() {
        books.add(libro1);
        books.add(libro2);
        books.add(libro3);
        return this.books;
    }
}
