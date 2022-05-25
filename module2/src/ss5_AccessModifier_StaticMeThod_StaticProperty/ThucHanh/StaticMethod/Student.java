package ss5_AccessModifier_StaticMeThod_StaticProperty.ThucHanh.StaticMethod;

public class Student {
    private String name;
    private int rollno;
    private static String college = " H ";

    Student(String n , int r){
        name = n;
        rollno = r;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(rollno +" "+ name +" "+ college);
    }

}
