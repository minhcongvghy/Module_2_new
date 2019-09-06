public class Cylinder extends Circle {
    private double height = 5;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolumetric() {
        return height * getRadius() * getRadius() * Math.PI;
    }

    @Override
    public String toString() {
        return "radius " + getRadius() + " height " + getHeight() + " color " + getColor() + " volumetric " + getVolumetric();
    }
}
