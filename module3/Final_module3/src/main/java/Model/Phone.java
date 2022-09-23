package Model;

public class Phone {
    private int idPhone;
    private String name;
    private int price;
    private int idColor;

    public Phone() {
    }

    public Phone(int idPhone, String name, int price, int idColor) {
        this.idPhone = idPhone;
        this.name = name;
        this.price = price;
        this.idColor = idColor;
    }

    public Phone(String name, int price, int idColor) {
        this.name = name;
        this.price = price;
        this.idColor = idColor;
    }

    public int getIdPhone() {
        return idPhone;
    }

    public void setIdPhone(int idPhone) {
        this.idPhone = idPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIdColor() {
        return idColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }
}
