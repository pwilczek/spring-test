package name.wilu.spring;

import name.wilu.spring.repository.BookRepository;
import name.wilu.spring.repository.PriceRepository;
import name.wilu.spring.repository.StubBookRepository;
import name.wilu.spring.repository.StubPriceRepository;
import name.wilu.spring.service.BookService;
import name.wilu.spring.service.StubBookService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by PLPIWIL2 on 8/30/2014.
 */
@Configuration
public class AppConfig {

    @Bean(name = "bookService")
    public BookService bookService() {
        return new StubBookService();
    }

    @Bean(name = "bookRepository")
    public BookRepository bookRepository() {
        return new StubBookRepository();
    }

    @Bean(name = "priceRepository")
    public PriceRepository priceRepository() {
        return new StubPriceRepository();
    }
}

