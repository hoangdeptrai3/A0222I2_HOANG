package ss5_AccessModifier_StaticMeThod_StaticProperty.BaiTap.XayDungLopChiGhiTrongJava;

public class Student {
    private String name = "jone";
    private String classes = "CO2";
    public Student(){

    }
    public void setName(String newName){
        this.name = newName;
        System.out.println("your name is "+this.name);
    }
    public void setClasses(String newClass){
        this.classes = newClass;
        System.out.println("your class "+ this.classes);
    }


}
