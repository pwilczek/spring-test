package name.wilu.spring.repository;

import name.wilu.spring.model.Book;

/**
 * Created by PLPIWIL2 on 8/30/2014.
 */
public interface PriceRepository {
    long priceFor(Book book);
}
