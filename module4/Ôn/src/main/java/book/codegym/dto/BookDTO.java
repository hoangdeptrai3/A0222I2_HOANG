package book.codegym.dto;

import book.codegym.model.KindOfBook;
import org.springframework.validation.Validator;

import javax.persistence.*;

public class BookDTO  {



    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Integer price;
    @Column(name = "manufacturer")
    private String manufacturer;
    @Column(name = "quantity")
    private Integer quantity;

    private Long kindBook;

    public BookDTO() {
    }

    public BookDTO(Long id, String name, Integer price, String manufacturer, Integer quantity, Long kindBook) {
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

    public Long getKindBook() {
        return kindBook;
    }

    public void setKindBook(Long kindBook) {
        this.kindBook = kindBook;
    }
}
