package demo.QuanLySach;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private String nameBook;
    private String idBook;
    private float priceBook;
    public Book(String idBook){
        this.idBook = idBook;
    }
    public Book(String nameBook, String idBook, float priceBook) {
        this.nameBook = nameBook;
        this.idBook = idBook;
        this.priceBook = priceBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public float getPriceBook() {
        return priceBook;
    }

    public void setPriceBook(float priceBook) {
        this.priceBook = priceBook;
    }


    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", idBook='" + idBook + '\'' +
                ", priceBook=" + priceBook +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.idBook.compareTo(o.idBook);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(idBook, book.idBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, idBook, priceBook);
    }
}
