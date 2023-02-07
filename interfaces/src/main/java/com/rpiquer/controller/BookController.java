package com.rpiquer.controller;

import java.util.List;
import com.rpiquer.business.service.*;
import com.rpiquer.business.service.impl.*;
import com.rpiquer.business.entity.*;


public class BookController {
    private BooksService service = new BooksServiceImpl();
    
    public List<Book> getAll(){
        return service.getAll();
    }
    
}
