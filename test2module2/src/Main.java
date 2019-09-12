import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManageContacts manageContacts = new ManageContacts();
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("----------------MENU-----------------");
            System.out.println("1.Hiển thị danh bạ");
            System.out.println("2.Thêm số điện thoại mới vào danh bạ");
            System.out.println("3.Sửa danh bạ");
            System.out.println("4.Xóa danh bạ");
            System.out.println("5.Tìm danh bạ");
            System.out.println("0.Thoát");
            System.out.println("--------------------------------------");
            System.out.println("Chọn: ");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    manageContacts.printContacts();
                    break;
                case 2:
                    manageContacts.addContacts();
                    break;
                case 3:
                    manageContacts.editContacts();
                    break;
                case 4:
                    manageContacts.removeContact();
                    break;
                case 5:
                    System.out.println("-----------------------------");
                    System.out.println("1. Tìm theo tên");
                    System.out.println("2. Tìm theo họ");
                    System.out.println("3. Tìm theo số điện thoại");
                    System.out.println("-----------------------------");
                    System.out.println("Chọn: ");
                    int option;
                    option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            manageContacts.searchByFirstName();
                            break;
                        case 2:
                            manageContacts.searchByLastName();
                        case 3:
                            manageContacts.searchByNumber();
                        default:
                            System.exit(0);
                    }

            }
        } while (choose != 0);
    }
}
