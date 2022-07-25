package project.libraryManager.model;

public class Story extends Book{
    private String type;
    private String authorName;
public Story(){

}
    public Story(String type, String authorName) {
        this.type = type;
        this.authorName = authorName;
    }

    public Story(int id, String name, double price, String nhaSanXuat, String type, String authorName) {
        super(id, name, price, nhaSanXuat);
        this.type = type;
        this.authorName = authorName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Story{" +
                "type='" + type + '\'' +
                ", authorName='" + authorName + '\'' +
                '}'+super.toString();
    }
}
