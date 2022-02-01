package com.dxc.libraryrestapp.service;

import java.util.List;

import com.dxc.libraryrestapp.model.Book;

public interface BookService {

    public Book getBookById(int id);

    public Book getBookByTitle(String title);

    public Book createBook(Book book);

    public Book updateBook(Book book);

    public void deleteBook(int id);

    public List<Book> getAllBooks();

}