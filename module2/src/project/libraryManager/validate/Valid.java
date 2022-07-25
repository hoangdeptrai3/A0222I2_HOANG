package project.libraryManager.validate;

public class Valid {
    public static  boolean checkName(String name){
        return name.matches("\\w{1,}\\s{0,}");
    }
    public static boolean checkPrice(String price){
        return price.matches("\\d*");
    }
}
