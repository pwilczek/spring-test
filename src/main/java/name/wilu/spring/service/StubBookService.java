package name.wilu.spring.service;

import java.util.List;
import name.wilu.spring.model.Book;
import name.wilu.spring.repository.BookRepository;
import name.wilu.spring.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by PLPIWIL2 on 8/21/2014.
 */
@Service("bookService")
@Scope("prototype")
public class StubBookService implements BookService {

    @Autowired private BookRepository bookRepository;
    @Autowired private PriceRepository priceRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public long priceFor(Book book) {
        return priceRepository.priceFor(book);
    }


}
