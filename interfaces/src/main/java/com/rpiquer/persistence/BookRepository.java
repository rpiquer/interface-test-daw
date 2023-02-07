package com.rpiquer.persistence;

import java.util.List;
import com.rpiquer.business.entity.*;


public interface BookRepository {
    
    public List<Book> all();
}
