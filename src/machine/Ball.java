package machine;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;
    public Ball(float x, float y, int radius, int  speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = (float) speed;
        this.yDelta = (float) direction;



    }
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    public void move(){
        x+=xDelta;
        y+=yDelta;
    }
    public void reflectHorizontal(){
        this.xDelta-=xDelta;
        this.yDelta=yDelta;
    }
    public void reflectVertical() {
        this.yDelta -= yDelta;
        this.xDelta=xDelta;
    }

    @Override
    public String toString() {
        return "Ball at ( " + x + y + ") of velocity (Δx, Δy)";
    }
}
