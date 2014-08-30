package name.wilu.spring.service;

import java.util.List;
import name.wilu.spring.model.Book;
import name.wilu.spring.repository.BookRepository;

/**
 * Created by PLPIWIL2 on 8/21/2014.
 */
public class StubBookService implements BookService {

    private BookRepository bookRepository;

    @Override
    public List<Book>findAll(){
        return bookRepository.findAll();
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
