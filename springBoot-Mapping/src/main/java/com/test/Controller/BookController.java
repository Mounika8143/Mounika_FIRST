package com.test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.test.Entity.Book;
import com.test.service.BookService;

@RestController
	@RequestMapping(value = "/book")
	public class BookController {
		@Autowired
		private BookService bookService;
	    @RequestMapping(value = "/savebook", method = RequestMethod.POST)
	    @ResponseBody
	    public Book saveBook(@RequestBody Book book) {
	        Book bookResponse = bookService.saveBook(book);
	        return bookResponse;
	    }
	    @RequestMapping(value = "/{bookId}", method = RequestMethod.GET)
	    @ResponseBody
	    public Book getBookDetails(@PathVariable int bookId) {
	        Book bookResponse = bookService.findByBookId(bookId);
	        return bookResponse;
	    }
	}
