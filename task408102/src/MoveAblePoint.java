import java.util.Arrays;

public class MoveAblePoint extends Point {
    private float xSpeed = 0;
    private float ySpeed = 0;
    public MoveAblePoint() {

    }
    public MoveAblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        float[] array ={this.xSpeed, this.ySpeed};
        return array;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return super.toString() + "speed = "+ Arrays.toString(getSpeed());
    }
    public MoveAblePoint Move() {
        x += xSpeed;
        y += ySpeed;
        return this;

    }
}
