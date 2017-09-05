package tutorial.action;

import org.seasar.extension.dbcp.ConnectionPool;
import org.seasar.struts.annotation.Execute;
import tutorial.entity.Book;
import tutorial.service.BookService;

import javax.annotation.Resource;
import java.util.List;

public class IndexAction {
    public List<Book> books;

    @Resource
    private BookService bookService;

    @Resource
    private ConnectionPool connectionPool;

    @Execute(validator = false)
    public String index() {
        // ①Action側でのトランザクション開始
        books = bookService.find();
        // ②新しいトランザクションを開く
        books = bookService.findNewTransaction();

        return "index.jsp";
    }
}
