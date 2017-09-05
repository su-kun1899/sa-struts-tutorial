package tutorial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author su-kun1899
 */
@Entity
@Table(name = "book")
public class Book {
    @Id
    @Column
    public long isbn;

    @Column
    public String title;
}
