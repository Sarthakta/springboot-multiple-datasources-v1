package com.example.demo.books;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("booksTransactionManager")
public interface BooksRepository extends JpaRepository<Books, Integer> {

}