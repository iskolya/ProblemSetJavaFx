package ProblemSet7;

public class MyPoint {
    private int x=0;
    private int y=0;
    MyPoint(){
    }
    public MyPoint(int x, int y){
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
        int[] xy = {x, y};
        return xy;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }
    public double distance(int x, int y){
        double dis = Math.sqrt(Math.pow(this.x-x, 2)+Math.pow(this.y-y, 2));
        return dis;
    }
    public double distance(MyPoint another){
        double dis = Math.sqrt(Math.pow(this.x-another.x, 2)+Math.pow(this.y-another.y, 2));
        return dis;
    }
    public double distance(){
        double dis = Math.sqrt(Math.pow(this.x, 2)+Math.pow(this.y, 2));
        return dis;
    }
}
