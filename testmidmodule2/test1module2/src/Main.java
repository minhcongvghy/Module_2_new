import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageProduct manageProduct = new ManageProduct();
        int choose;
        do {
            System.out.println("-----------MENU-----------------");
            System.out.println("1. Hiển thị danh sách sản phẩm");
            System.out.println("2. Thêm mới sản phẩm");
            System.out.println("3. Sửa thông tin sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tìm sản phẩm theo tên");
            System.out.println("0. Thoát");
            System.out.println("---------------------------------");
            System.out.println("Chọn: ");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    manageProduct.printProduct();
                    break;
                case 2:
                    manageProduct.addProduct();
                    break;

                case 3:
                    manageProduct.editProduct();
                    break;
                case 4:
                    manageProduct.deleteProduct();
                    break;
                case 5:
                    manageProduct.searchProduct();
                    break;
            }
        }
        while (choose != 0);
    }
}
