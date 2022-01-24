package com.dxc.dao;

import java.sql.SQLException;
import java.util.List;

import model.Book;

public interface BookDao {
    
    int save(Book book) throws SQLException;

    List<Book> findAll() throws SQLException;
}