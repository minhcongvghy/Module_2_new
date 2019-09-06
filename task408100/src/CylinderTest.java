public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(10);
        System.out.println(cylinder);
        cylinder = new Cylinder(15, 15, "yellow");
        System.out.println(cylinder);
    }
}
