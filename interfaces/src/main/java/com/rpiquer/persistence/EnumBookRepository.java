package com.rpiquer.persistence;

public enum EnumBookRepository {
    LIBRO1(4, "Guerra y Paz", "Leon Tolstoi"),
    LIBRO2(5, "Crimen y Castigo", "Dostoyevski"),
    LIBRO3(6, "Desconexión", "Neal Shusterman");

    private int id;
    private String title;
    private String author;

    private EnumBookRepository(int id, String title, String author){
        this.id=id;
        this.title=title;
        this.author=author;
    }

    public int getId(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }

}

