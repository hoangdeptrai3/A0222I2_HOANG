package ss6_ThuaKe.BaiTap.PointAndMoveablePoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MoveablePoint(){

    }
    public MoveablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getxSpeed(){
        return this.xSpeed;
    }
    public void setxSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }
    public float getySpeed(){
        return this.ySpeed;
    }
    public void setySpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] arr = new float[2];
        arr[0] = this.xSpeed;
        arr[1] = this.ySpeed;
        return arr;
    }
    public MoveablePoint move(){
        setX(getX()+ xSpeed);
        setY(getY()+ ySpeed);
        return this;
    }


    @Override
    public String toString() {
        return "MoveablePoint{"+" x = "+getX()+ " y ="+getY() + " xSpeed=" + xSpeed + ", ySpeed=" + ySpeed +  '}';
    }
}
