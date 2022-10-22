package com.basics.trialin10steps;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		return Arrays.asList(
				new Book(1l, "Cloud Computing" , " Mr. Harvinder"));
	}
}
