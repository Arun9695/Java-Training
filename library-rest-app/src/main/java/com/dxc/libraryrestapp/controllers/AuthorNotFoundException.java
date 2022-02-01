package com.dxc.libraryrestapp.controllers;

public class AuthorNotFoundException extends RuntimeException {

    AuthorNotFoundException(Integer id) {

        super("Could not find Author " + id);
    }
}
