package com.dxc.assessment;

import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.List;
import com.dxc.assessment.dao.AuthorDao;
import com.dxc.assessment.dao.AuthorDaoImpl;
import com.dxc.assessment.modal.Author;
import com.google.protobuf.Internal.LongList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello World!");
        Author roni = new Author(1, "Roni", "George", "fiction", "roni@gmail.com");
        Author dune = new Author(2, "Dune", "Frank", "scifi", "dune@gmail.com");
        Author hobbit = new Author(3, "Hobbit", "Tolkien", "action", "hobbit@gmail.com");

        AuthorDaoImpl dao = new AuthorDaoImpl();
        List<Author> authors = List.of(roni, dune, hobbit);

        authors.forEach(bk -> {
            try {
                dao.create(bk);

            } catch (SQLException e) {
                // TODO: handle exception
                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        });

        System.out.println(dao.findById(2));

        System.out.println(dao.findByGenre("action"));

        System.out.println(dao.findAll());

    }

}