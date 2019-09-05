import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập cạnh a: ");
            double a = scanner.nextDouble();
            System.out.println("Nhập cạnh b: ");
            double b = scanner.nextDouble();
            System.out.println("Nhập cạnh c: ");
            double c = scanner.nextDouble();
            Triangle triangle = new Triangle(a, b,c);
        } catch (IllegalTriangleException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
