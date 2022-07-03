package ss15_XuLiNgoaiLe_Debug.BaiTap;
import java.util.*;
public class Test {
    public static void main(String[] args) throws IllegalTriangleException {
       Scanner scanner= new Scanner(System.in);

       do{
           try {
               System.out.printf("Input side 1: ");
               double side1= Double.parseDouble(scanner.nextLine());
               System.out.printf("Input side 2: ");
               double side2= Double.parseDouble(scanner.nextLine());
               System.out.printf("Input side 3: ");
               double side3= Double.parseDouble(scanner.nextLine());
               Triangle triangle= new Triangle(side1, side2, side3);
               System.out.println("primeter : "+ triangle.getPerimeter());
               break;
           }catch (IllegalTriangleException e){
               System.out.println(e.getMessage());
           }catch (NumberFormatException e){
               System.out.println(e.getMessage());
           }
       }while (true);
    }






//        // runtime no need try catch
//        try {
//            Triangle triangle = new Triangle(-1, 6, 8);
//            System.out.println(triangle.getPerimeter());
//        } catch (IllegalTriangleException e) {
////            e.printStackTrace();
//            System.out.println(e.getMessage());
////             do action again
////            System.out.printf("Input again");
//        }
//    }
}
