public class Main {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(x, "yellow", false);
        shapes[1] = new Rectangle(x, x, "red", true);
        shapes[2] = new Square(x, "green", false);
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        for (Shape shape : shapes) {
            shape.resize(Math.random() * 100);
        }
        System.out.println("\n");
        Shape.printShape(shapes);
    }
}
