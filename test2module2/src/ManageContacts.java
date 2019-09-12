import java.util.LinkedList;
import java.util.Scanner;

public class ManageContacts {
    LinkedList<Contacts> contactsList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    public void addContacts() {
        System.out.println("Nhập tên: ");
        String firstName = scanner.next();
        System.out.println("Nhập họ: ");
        String lastName = scanner.next();
        System.out.println("Nhập số điện thoại: ");
        String phoneNumber = scanner.next();
        Contacts contacts = new Contacts(firstName, lastName, phoneNumber);
        contactsList.add(contacts);
    }
    public void printContacts() {
        for (Contacts contacts : contactsList) {
            System.out.println(contacts.toString());
        }
    }
    public void editContacts() {
        System.out.println("Nhập tên cần sửa:");
        String editName = scanner.next();
        for (int i = 0; i < contactsList.size(); i++) {
            if (contactsList.get(i).getFirstName().equals(editName)) {
                System.out.println("Nhập tên: ");
                String firstName = scanner.next();
                System.out.println("Nhập họ: ");
                String lastName = scanner.next();
                System.out.println("Nhập số điện thoại: ");
                String phoneNumber = scanner.next();
                Contacts newContact = new Contacts(firstName, lastName, phoneNumber);
                contactsList.set(i, newContact);
            }
        }
    }
    public void removeContact() {
        System.out.println("Nhập số điện thoại cần xóa: ");
        String number = scanner.next();
        for (int i = 0; i < contactsList.size(); i++) {
            if (contactsList.get(i).getPhoneNumber().equals(number)) {
                contactsList.remove(i);
                break;
            }
        }
    }
    public void searchByFirstName() {
        LinkedList<Contacts> listName = new LinkedList<>();
        System.out.println("Nhập tên cần tìm: ");
        String search = scanner.next();
        for (int i = 0; i < contactsList.size(); i++) {
            if (contactsList.get(i).getFirstName().equals(search)) {
                listName.add(contactsList.get(i));
            }
        }
        for (int i = 0; i < listName.size(); i++) {
            System.out.println(listName.get(i).toString());
        }
    }
    public void searchByLastName() {
        LinkedList<Contacts> listName = new LinkedList<>();
        System.out.println("Nhập họ cần tìm: ");
        String searchLastName = scanner.next();
        for (int i = 0; i < contactsList.size(); i++) {
            if (contactsList.get(i).getLastName().equals(searchLastName)) {
                listName.add(contactsList.get(i));
            }
        }
        for (int i = 0; i < listName.size(); i++) {
            System.out.println(listName.get(i).toString());
        }
    }
    public void searchByNumber() {
        LinkedList<Contacts> listNumber = new LinkedList<>();
        System.out.println("Nhập số điện thoại cần tìm: ");
        String searchNumber = scanner.next();
        for (int i = 0; i < contactsList.size(); i++) {
            if (contactsList.get(i).getPhoneNumber().equals(searchNumber)) {
                listNumber.add(contactsList.get(i));
            }
        }
        for (int i = 0; i < listNumber.size(); i++) {
            System.out.println(listNumber.get(i).toString());
        }
    }
}
