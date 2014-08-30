package name.wilu.spring;

import java.io.IOException;
import name.wilu.spring.model.Book;
import name.wilu.spring.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) throws IOException {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        BookService bookService = ctx.getBean("bookService", BookService.class);
        Book book = bookService.findAll().get(0);
        System.out.println(book);
        System.out.println("Price for book is: " + bookService.priceFor(book));
    }
}
