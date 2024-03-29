package com.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.Entity.Book;

@Repository
	public interface BookRepository extends JpaRepository<Book, Integer>
	{
	    public Book findByBookId(int BookId);

}
