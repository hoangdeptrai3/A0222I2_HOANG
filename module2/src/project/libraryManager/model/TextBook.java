package project.libraryManager.model;

public class TextBook extends Book{
    private String department;
    private int className;

//    public TextBook(String name, double price, String manufacturer, String dep, int className){
//
//    }
    public TextBook(String department, int className) {
        this.department = department;
        this.className = className;
    }

    public TextBook(int id, String name, double price, String nhaSanXuat, String department, int className) {
        super(id, name, price, nhaSanXuat);
        this.department = department;
        this.className = className;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getClassName() {
        return className;
    }

    public void setClassName(int className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "TextBook{" +
                "department='" + department + '\'' +
                ", className=" + className +
                '}'+super.toString();
    }
}
