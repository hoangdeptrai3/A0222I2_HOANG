package OnTap_Module_2.PhoneManager.Validate;

public class Valid {
//    public static boolean isNumber(String val){
//        try{
//            Double.parseDouble(val);
//            return true;
//        }
//        catch(Exception e){
//            return false;
//        }
//    }
    public static boolean moreThan0(String val){
        return val.matches("\\d*");
    }

    public static boolean checkName(String name){
        return name.matches("\\w{1,}\\s{0,}\\w+");
    }

//    public static boolean checkName(String name){
//        return name.matches("[ABC]\\w*");
//    }
}
