package name.wilu.spring.repositiry;

import java.util.List;
import name.wilu.spring.model.Book;

/**
 * Created by PLPIWIL2 on 8/21/2014.
 */
public interface BookRepository {
    List<Book>findAll();
}
