package name.wilu.spring;

import java.io.IOException;
import name.wilu.spring.service.BookService;
import name.wilu.spring.service.StubBookService;

public class App {
    public static void main(String[] args) throws IOException {
        BookService bookService=new StubBookService();
        System.out.println(bookService.findAll().get(0));
    }
}
