package demo.QuanLySach_LinkedList;

public class Book {
    private int id;
    private String nameBook;
    private float priceBook;
    public Book(int id){
        this.id = id;
    }

    public Book(int id, String nameBook, float priceBook) {
        this.id = id;
        this.nameBook = nameBook;
        this.priceBook = priceBook;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
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
                "id=" + id +
                ", nameBook='" + nameBook + '\'' +
                ", priceBook=" + priceBook +
                '}';
    }
}
