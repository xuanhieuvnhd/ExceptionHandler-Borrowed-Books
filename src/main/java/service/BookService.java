package service;

import model.BookEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BookService {
    public Page<BookEntity> findAll(Pageable pageable);

    public BookEntity findById(Integer id);

    public void save(BookEntity bookEntity);

    public void  delete(Integer id);
}