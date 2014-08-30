package name.wilu.spring.repository;

import java.util.ArrayList;
import java.util.List;
import name.wilu.spring.model.Book;
import org.springframework.stereotype.Repository;

/**
 * Created by PLPIWIL2 on 8/21/2014.
 */
@Repository("bookRepository")
public class StubBookRepository implements BookRepository {

    public List<Book>findAll(){
        ArrayList<Book> result = new ArrayList<Book>();
        result.add(prepareBook());
        return result;
    }

    private Book prepareBook() {
        Book book;
        book= new Book();
        book.setAuthor("Piotr Wilczek");
        book.setTitle("Spring example");
        return book;
    }

}
