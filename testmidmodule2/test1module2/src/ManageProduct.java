import java.util.ArrayList;
import java.util.Scanner;

public class ManageProduct {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Products> products = new ArrayList<>();

    public void addProduct() {
        System.out.println("Nhập ID: ");
        int id = scanner.nextInt();
        System.out.println("Nhập tên: ");
        String name = scanner.next();
        System.out.println("Nhập giá: ");
        float price = scanner.nextFloat();
        System.out.println("Nhập mô tả: ");
        String description = scanner.next();
        Products newProduct = new Products(id, name, price, description);
        products.add(id - 1, newProduct);
    }

    public void printProduct() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).toString());
        }
    }

    public void editProduct() {
        System.out.println("Nhập ID sản phẩm cần sửa: ");
        int editID = scanner.nextInt();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == editID) {
                System.out.println("Nhập ID: ");
                int id = scanner.nextInt();
                System.out.println("Nhập tên: ");
                String name = scanner.next();
                System.out.println("Nhập giá: ");
                float price = scanner.nextFloat();
                System.out.println("Nhập mô tả: ");
                String desciption = scanner.next();
                Products editProducts = new Products(id, name, price, desciption);
                products.set(editID - 1, editProducts);

            }
        }
    }

    public void deleteProduct() {
        System.out.println("Nhập ID sản phẩm cần xóa: ");
        int index = scanner.nextInt();
        for (int i = 0; i < products.size(); i++)
            if (products.get(i).getId() == index) {
                products.remove(i);
            }
    }

    public void searchProduct() {
        System.out.println("Nhập tên: ");
        String name = scanner.next();
        System.out.println(name);
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                System.out.println(products.get(i).toString());
                break;
            }
        }
    }
}
