package service.impl;

import model.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repository.BookRepository;
import service.BookService;

public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Page<BookEntity> findAll(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

    @Override
    public BookEntity findById(Integer id) {
        return bookRepository.findOne(id);
    }

    @Override
    public void save(BookEntity bookEntity) {
        bookRepository.save(bookEntity);
    }

    @Override
    public void delete(Integer id) {
        bookRepository.delete(id);
    }
}
