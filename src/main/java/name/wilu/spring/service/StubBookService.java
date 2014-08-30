package name.wilu.spring.service;

import java.util.List;
import name.wilu.spring.model.Book;
import name.wilu.spring.repository.BookRepository;
import name.wilu.spring.repository.PriceRepository;

/**
 * Created by PLPIWIL2 on 8/21/2014.
 */
public class StubBookService implements BookService {

    private final BookRepository bookRepository;
    private PriceRepository priceRepository;

    StubBookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @SuppressWarnings("UnusedDeclaration")
    public void setPriceRepository(PriceRepository priceRepository) {
        System.out.println("Setting price repo!");
        this.priceRepository = priceRepository;
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public long priceFor(Book book) {
        return priceRepository.priceFor(book);
    }
}
