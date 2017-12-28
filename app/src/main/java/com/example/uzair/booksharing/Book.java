package com.example.uzair.booksharing;

import java.util.ArrayList;

/**
 * Created by UZAIR on 12/25/2017.
 */


public class Book {
    public ArrayList<Book> userList;
    private String book_title;
    private String book_writer;
    private String price;
    private String gender;
    Book(String book_title,String book_writer, String price, String gender){
        this.price=price;
        this.book_writer=book_writer;
        this.book_title = book_title;
        this.gender=gender;
    }
    public String getName() {

        return book_title;
    }
    public void setName(String name) {
        this.book_title = name;
    }

    public String getBook_writer() {
        return book_writer;
    }
    public void setBook_writer(String book_writer) {
        this.book_writer = book_writer;
    }
    public String getNumber() {
        return price;
    }

    public void setNumber(String number) {
        this.price = number;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
