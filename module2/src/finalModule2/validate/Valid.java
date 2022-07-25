package finalModule2.validate;

public class Valid {
//    public static boolean checkMaDinhDanh(String val){
//            return val.matches("");
//    }
    public static boolean checkName(String name){
        return name.matches("([a-zA-Z]\\s*)*");
    }
    public static boolean checkLuong(String luong){
        return luong.matches("\\d*");
    }
//    public static boolean ngaySinh(String ngaySinh){
//        return ngaySinh.matches("")
//    }
}
