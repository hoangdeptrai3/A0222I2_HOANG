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

    public Book() {
    }
}