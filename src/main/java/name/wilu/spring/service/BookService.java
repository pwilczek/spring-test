package name.wilu.spring.service;

import java.util.List;
import name.wilu.spring.model.Book;

/**
 * Created by PLPIWIL2 on 8/21/2014.
 */
public interface BookService {
    List<Book> findAll();
    long priceFor(Book book);
}
