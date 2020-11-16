package Exer_6;

public class MyPoint {
    private int x=0;
    private int y=0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        return new int[]{x,y};
    }

    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "("+String.valueOf(x)+","+String.valueOf(y)+")";
    }

    public double distance(int x2,int y2){
        double res=Math.pow((x-x2),2)+Math.pow((y-y2),2);
        return Math.pow(res,0.5);
    }
    public double distance(MyPoint another){
        double res=Math.pow((x-another.x),2)+Math.pow((y-another.y),2);
        return Math.pow(res,0.5);
    }
    public double distance(){
        double res=Math.pow((x),2)+Math.pow((y),2);
        return Math.pow(res,0.5);
    }

}
