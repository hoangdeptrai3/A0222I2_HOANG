package book.codegym.model;

import javax.persistence.*;
import java.util.List;

@Table(name = "kind_of_book")
@Entity
public class KindOfBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "loaiSach")
    private String loaiSach;
    @OneToMany(mappedBy = "kindBook")
    private List<Book> books;

    public KindOfBook() {
    }

    public KindOfBook(Long id, String loaiSach, List<Book> books) {
        this.id = id;
        this.loaiSach = loaiSach;
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoaiSach() {
        return loaiSach;
    }

    public void setLoaiSach(String loaiSach) {
        this.loaiSach = loaiSach;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}