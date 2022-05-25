package demo;

public class Object2 {
    private float banKinh;
    private Double PI = 3.14;

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    public Double getPI() {
        return PI;
    }

    public void setPI(Double PI) {
        this.PI = PI;
    }
    public void display(){
        System.out.println("dien tich laf " +this.PI * Math.pow(banKinh,2));
    }

    public static void main(String[] args) {
        Object2 a = new Object2();
        a.setBanKinh(10);
        a.display();


    }
}
