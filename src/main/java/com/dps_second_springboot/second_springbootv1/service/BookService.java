package com.dps_second_springboot.second_springbootv1.service;

import java.util.HashSet;

import com.dps_second_springboot.second_springbootv1.model.Book;
public interface BookService {
	HashSet<Book> findAllBooks();
	Book finById(long id);
	void addBook(Book b);
	void deleteAllBooks();
	void delById(long id);
}
