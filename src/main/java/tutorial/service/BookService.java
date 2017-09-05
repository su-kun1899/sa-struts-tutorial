package tutorial.service;

import org.seasar.extension.jdbc.JdbcManager;
import tutorial.entity.Book;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author su-kun1899
 */
public class BookService {
    @Resource
    private JdbcManager jdbcManager;

    public List<Book> find() {
        return jdbcManager.from(Book.class).getResultList();
    }
}
