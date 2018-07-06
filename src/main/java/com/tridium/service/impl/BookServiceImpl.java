package com.tridium.service.impl;

import com.tridium.dao.BookDao;
import com.tridium.model.Book;
import com.tridium.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;
    @Override
    public List<Book> listBooks() {
        return bookDao.list();
    }
}
