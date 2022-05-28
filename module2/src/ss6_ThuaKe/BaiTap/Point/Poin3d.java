package ss6_ThuaKe.BaiTap.Point;

import java.util.Scanner;

public class Poin3d extends Point2D {
    private float z = 0.0f;
    public Poin3d(float x , float y , float z){
        super(x, y);
        this.z = z;
    }
    public Poin3d(){

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    void setXYZ(float x,float y,float z){
        super.setXY(x,y);
        this.z= z;
    }
    public float[] getXYZ(){
        float [] arr = new float[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = this.z;
        return arr;
    }

    public String toString() {
        return "x = " +getX() +" y = " +getY() + "z = "+getZ();
    }

}
