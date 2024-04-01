package com.Aithani.LibraryManagementApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Aithani.LibraryManagementApp.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>
{
}
