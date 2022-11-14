package book.codegym.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "book")
@Entity
@Setter
@Getter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Integer price;
    @Column(name = "manufacturer")
    private String manufacturer;
    @Column(name = "quantity")
    private Integer quantity;
    @ManyToOne
    @JoinColumn(name = "loaiSach")
    private KindOfBook kindBook;

    public Book() {
    }

    public Book(Long id, String name, Integer price, String manufacturer, Integer quantity, KindOfBook kindBook) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.kindBook = kindBook;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public KindOfBook getKindBook() {
        return kindBook;
    }

    public void setKindBook(KindOfBook kindBook) {
        this.kindBook = kindBook;
    }
}