package name.wilu.spring;

import java.io.IOException;
import name.wilu.spring.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws IOException {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("app-context.xml");
        BookService bookService = ctx.getBean("bookService", BookService.class);
        System.out.println(bookService.findAll().get(0));
    }
}
