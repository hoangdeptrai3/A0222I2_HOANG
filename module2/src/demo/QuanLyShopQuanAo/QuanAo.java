package demo.QuanLyShopQuanAo;

public class QuanAo {
    private int idQuanAo;
    private String nameQuanAo;
    private float priceQuanAo;

    public QuanAo(int idQuanAo) {
        this.idQuanAo = idQuanAo;
    }

    public QuanAo(int idQuanAo, String nameQuanAo, float priceQuanAo) {
        this.idQuanAo = idQuanAo;
        this.nameQuanAo = nameQuanAo;
        this.priceQuanAo = priceQuanAo;
    }

    public int getIdQuanAo() {
        return idQuanAo;
    }

    public void setIdQuanAo(int idQuanAo) {
        this.idQuanAo = idQuanAo;
    }

    public String getNameQuanAo() {
        return nameQuanAo;
    }

    public void setNameQuanAo(String nameQuanAo) {
        this.nameQuanAo = nameQuanAo;
    }

    public float getPriceQuanAo() {
        return priceQuanAo;
    }

    public void setPriceQuanAo(float priceQuanAo) {
        this.priceQuanAo = priceQuanAo;
    }

    @Override
    public String toString() {
        return "QuanAo{" +
                "idQuanAo=" + idQuanAo +
                ", nameQuanAo='" + nameQuanAo + '\'' +
                ", priceQuanAo=" + priceQuanAo +
                '}';
    }
}
