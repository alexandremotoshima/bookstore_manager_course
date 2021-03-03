package com.alexandremotoshima.bookstoremanager.repository;

import com.alexandremotoshima.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
