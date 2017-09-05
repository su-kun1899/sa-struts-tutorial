package tutorial.service;

import org.seasar.extension.dbcp.ConnectionPool;
import org.seasar.extension.jdbc.JdbcManager;
import tutorial.entity.Book;

import javax.annotation.Resource;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import java.util.List;

/**
 * @author su-kun1899
 */
public class BookService extends ParentService{
    @Resource
    private JdbcManager jdbcManager;

    @Resource
    private ConnectionPool connectionPool;

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public List<Book> findNewTransaction(boolean error) {
        final List<Book> books = this.jdbcManager.from(Book.class).getResultList();
        return books;
    }

    public List<Book> find(boolean error) {
        final List<Book> books = this.jdbcManager.from(Book.class).getResultList();
        return books;
    }
}
