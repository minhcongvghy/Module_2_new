public class Triangle {
    public double a;
    public double b;
    public double c;
    public Triangle() {

    }

    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        this.a = a;
        this.b = b;
        this.c = c;
        if (a>0 && b>0 && c>0 && ((a+b>c) && (a+c>b) && (b+c>a))) {
            System.out.println("Đây là 3 cạnh của tam giác");
        } else {
            throw new IllegalTriangleException();
        }
    }
}
