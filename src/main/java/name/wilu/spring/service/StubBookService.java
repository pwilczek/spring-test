package name.wilu.spring.service;

import java.util.List;
import name.wilu.spring.model.Book;
import name.wilu.spring.repository.BookRepository;
import name.wilu.spring.repository.PriceRepository;

/**
 * Created by PLPIWIL2 on 8/21/2014.
 */
public class StubBookService implements BookService {

    private BookRepository bookRepository;
    private PriceRepository priceRepository;

    @SuppressWarnings("UnusedDeclaration")
     StubBookService() {
        System.out.println("Default constructor call!");
    }

    @SuppressWarnings("UnusedDeclaration")
    StubBookService(BookRepository bookRepository) {
        System.out.println("Arg constructor call!");
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public long priceFor(Book book) {
        return priceRepository.priceFor(book);
    }

    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("Setting book repo!");
        this.bookRepository = bookRepository;
    }

    @SuppressWarnings("UnusedDeclaration")
    public void setPriceRepository(PriceRepository priceRepository) {
        System.out.println("Setting price repo!");
        this.priceRepository = priceRepository;
    }
}
