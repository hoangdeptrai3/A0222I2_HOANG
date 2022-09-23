package Model;

public class Color {
    private int id_Color;
    private String nameColor;

    public Color() {
    }

    public Color(int id_Color, String nameColor) {
        this.id_Color = id_Color;
        this.nameColor = nameColor;
    }

    public int getId_Color() {
        return id_Color;
    }

    public void setId_Color(int id_Color) {
        this.id_Color = id_Color;
    }

    public String getNameColor() {
        return nameColor;
    }

    public void setNameColor(String nameColor) {
        this.nameColor = nameColor;
    }
}
