package com.test.service;

import org.springframework.stereotype.Component;

import com.test.Entity.Book;

@Component
	public interface BookService {

	    public Book saveBook(Book book);
	    public Book findByBookId(int bookId);
}
