package com.rpiquer.business.service.impl;

import com.rpiquer.persistence.*;
import com.rpiquer.persistence.impl.*;

import java.util.List;

import com.rpiquer.business.entity.Book;
import com.rpiquer.business.service.*;

public class BooksServiceImpl implements BooksService {
    private BookRepository repositorio = new EnumBookRepositoryImpl();
    public List<Book> getAll(){
        return this.repositorio.all();
    }
    
}
