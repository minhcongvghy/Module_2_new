import java.util.Arrays;

public class Point {
    protected float x = 0;
    protected float y = 0;
    public Point() {

    }
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
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
    public float[] getXY() {
        float[] array = {this.x, this.y};
        return array;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "array[x,y] = " + Arrays.toString(getXY());
    }
}
