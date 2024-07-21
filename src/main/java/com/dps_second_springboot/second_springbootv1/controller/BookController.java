package com.dps_second_springboot.second_springbootv1.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dps_second_springboot.second_springbootv1.model.Book;
import com.dps_second_springboot.second_springbootv1.service.BookServiceImpl;

import java.util.HashSet;
@RestController 
public class BookController {
	
	@Autowired
	BookServiceImpl bookServiceImpl;
	
	@PostMapping("/")
	public void addBook(@RequestBody Book book) {
		bookServiceImpl.addBook(book);
	}
	@GetMapping("/find_all")
	public HashSet<Book> findAllBooks() {
		return bookServiceImpl.findAllBooks();
	}
	@GetMapping("/find_by_id/{bookid}")
	public Book getBookById(@PathVariable long bookid) {
		return bookServiceImpl.finById(bookid);
	}
	@DeleteMapping("/del_by_id/{bookid}")
	public void delBookById(@PathVariable long bookid) {
		 bookServiceImpl.delById(bookid);
	}
	@DeleteMapping("/delete")
	public void deleteAllBooks() {
		bookServiceImpl.deleteAllBooks();
	}
}