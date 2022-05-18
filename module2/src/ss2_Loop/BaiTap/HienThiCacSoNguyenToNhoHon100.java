package ss2_Loop.BaiTap;

public class HienThiCacSoNguyenToNhoHon100 {
    public static boolean KtraSNT(int n){
        if (n < 2){
            return false;
        }else {
            for (int i = 2;i<=Math.sqrt(n);i++){
                if (n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 2;

//        while (count < 100){
//            if (KtraSNT(n) == true){
//                System.out.println("snt " +n);
//                count++;
//            }
//            n++;
//        }
        for (int i = 1 ; i<=100;i++){
            if (KtraSNT(n) == true){
                System.out.println("snt thu "+i +" la : " +n);
            }
            n++;
        }
    }
}
