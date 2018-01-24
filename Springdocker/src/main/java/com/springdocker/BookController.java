package com.springdocker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;

	@RequestMapping(method=RequestMethod.POST,value="/book")
	public Book saveBook(@RequestBody Book book)
	{
		return bookService.saveBook(book);
		
	}
}
