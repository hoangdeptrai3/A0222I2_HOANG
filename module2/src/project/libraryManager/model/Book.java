package project.libraryManager.model;

public abstract class Book {
    private int id;
    private String name;
    private double price;
    private String nhaSanXuat;

    public Book(){

    }
    public Book(int id, String name, double price, String nhaSanXuat) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                '}';
    }
}
