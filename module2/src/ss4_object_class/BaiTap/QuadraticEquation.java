package ss4_object_class.BaiTap;

import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;
    public QuadraticEquation(){

    }
    private QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double  getDiscriminant(){
        return Math.pow(this.b,2) - 4*this.a*this.c;
    }
    public double getRoot1(){
        double r1 = (-this.b + Math.pow(getDiscriminant(),0.5))/2*this.a;
        return r1;
    }
    public double getRoot2(){
        double r2 = (-this.b - Math.pow(getDiscriminant(),0.5))/2*this.a;
        return r2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a :");
        double a = sc.nextDouble();
        System.out.println("nhap b :");
        double b = sc.nextDouble();
        System.out.println("nhap c :");
        double c = sc.nextDouble();
        QuadraticEquation h = new QuadraticEquation(a,b,c);
        if (h.getDiscriminant() > 0){
            System.out.print("co 2 nghiem r1 = " +h.getRoot1() + " r2 =" +h.getRoot2());
        }else if (h.getDiscriminant() == 0){
            System.out.println("co mot ngiem " +h.getRoot1());
        }else {
            System.out.println("ko co nghiem ");
        }
    }

}
