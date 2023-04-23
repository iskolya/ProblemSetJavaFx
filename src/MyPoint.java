public class MyPoint {
    private int x;
    private int y;
    public MyPoint(){

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
        int[] xy = {x, y};
        return xy;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "{(" +
                x +
                ", y=" + y +
                '}';
    }
    public double distance(int x, int y){
        double xNew = this.x - x;
        double yNew = this.y - y;
        return Math.sqrt(Math.pow(xNew, 2) + Math.pow(yNew, 2));
    }
    public double distance(MyPoint another){
        int xNew2 = this.x - another.x;
        int yNew2 = this.y - another.y;
        return Math.sqrt(Math.pow(xNew2, 2) + Math.pow(yNew2, 2));
    }
    public double distance(){
        return Math.sqrt(Math.pow(this.x, 2)+ Math.pow(this.y, 2));
    }
}
