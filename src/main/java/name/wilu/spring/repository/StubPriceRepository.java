package name.wilu.spring.repository;

import name.wilu.spring.model.Book;
import org.springframework.stereotype.Repository;

/**
 * Created by PLPIWIL2 on 8/30/2014.
 */
@Repository("priceRepository")
public class StubPriceRepository implements PriceRepository {
    @Override
    public long priceFor(Book book){
        return 100;
    }

}
