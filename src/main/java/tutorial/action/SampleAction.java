package tutorial.action;

import org.seasar.struts.annotation.Execute;
import tutorial.entity.Book;
import tutorial.service.BookService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author su-kun1899
 */
public class SampleAction {
    @Resource
    private BookService bookService;

    public List<Book> books;

    @Execute(validator = false)
    public String index() {
        books = bookService.find();

        return "index.jsp";
    }
}
