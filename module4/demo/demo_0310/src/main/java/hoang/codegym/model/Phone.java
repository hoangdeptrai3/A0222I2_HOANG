package hoang.codegym.model;

public class Phone {
    private Integer id;
    private String name;
    private String Manufacturer;

    public Phone() {
    }

    public Phone(Integer id, String name, String manufacturer) {
        this.id = id;
        this.name = name;
        Manufacturer = manufacturer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }
}
