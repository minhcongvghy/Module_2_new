import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0;
    public Point3D() {

    }
    public Point3D(float x, float y, float z) {
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ() {
          float[] arrays = {this.getX(), this.getY(), this.z};
          return arrays;
    }

    @Override
    public String toString() {
        return "arrays[x,y,z] = "+ Arrays.toString(getXYZ());
    }
}
