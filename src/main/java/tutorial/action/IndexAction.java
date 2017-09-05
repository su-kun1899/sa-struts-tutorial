package tutorial.action;

import org.seasar.extension.dbcp.ConnectionPool;
import org.seasar.struts.annotation.Execute;
import tutorial.entity.Book;
import tutorial.service.BookService;

import javax.annotation.Resource;
import java.util.List;

public class IndexAction {
    public List<Book> books;

    public boolean error;

    @Resource
    private BookService bookService;

    @Resource
    private ConnectionPool connectionPool;

    @Execute(validator = false)
    public String index() {
        books = bookService.find(false);
        books = bookService.findNewTransaction(false);
//        try {
//            books = bookService.findNewTransaction(error);
//        } catch (Exception e) {
//            System.out.println("握りつぶしてやる");
//        }

        return "index.jsp";
    }
}
