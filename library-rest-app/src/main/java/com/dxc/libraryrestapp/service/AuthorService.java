package com.dxc.libraryrestapp.service;

import java.util.List;
import com.dxc.libraryrestapp.model.Author;

public interface AuthorService {

    public Author getAuthorById(int id);

    public Author getAuthorByName(String Name);

    public Author createAuthor(Author author);

    public Author updateAuthor(Author author);

    public void deleteAuthor(int id);

    public List<Author> getAllAuthors();

}