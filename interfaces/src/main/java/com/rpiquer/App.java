package com.rpiquer;

import java.util.List;

import com.rpiquer.controller.*;
import com.rpiquer.business.entity.*;

public class App {
    private static BookController controller = new BookController();

    public static void main(String[] args){
        List<Book> books = App.controller.getAll();
        System.out.println(books);
    }
}
