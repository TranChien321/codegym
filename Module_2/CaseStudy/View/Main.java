package CaseStudy.View;

import CaseStudy.Manager.ContactManager;
import CaseStudy.Model.Contact;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        List<Contact> contacts = Contact.readContactFromFile("contacts.txt");
        ContactManager contactManager = new ContactManager(contacts);
        System.out.println("======  QUẢN LÝ DANH BẠ  ======");
        System.out.println("1. Thêm liên hệ");
        System.out.println("2. Hiển thị danh bạ");
        System.out.println("3. Tìm kiếm liên hệ");
        System.out.println("4. Xóa liên hệ");
        System.out.println("5. Cập nhật liên hệ");
        System.out.println("6. Lưu danh bạ vào file");
        System.out.println("7. Đọc danh bạ từ file");
        System.out.println("8. Hiển thị liên hệ ưa thích");
        System.out.println("9. Chuyển trạng thái ưa thích");
        System.out.println("10. Sắp xếp danh bạ");
        System.out.println("11. Nhóm danh bạ");
        System.out.println("12. Xuất danh bạ ra file CSV");
        System.out.println("0. Thoát chương trình");
        System.out.println("==================================");
        
        while (true) {
            System.out.print(" Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.println("====  Nhập thông tin liên hệ mới ====");
                    System.out.print("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Nhập email: ");
                    String email = scanner.nextLine();
                    System.out.print("Nhập địa chỉ: ");
                    String address = scanner.nextLine();
                    String group;
                    while (true) {
                        System.out.print("Nhập nhóm (Gia đình/Công việc/Bạn bè): ");
                        group = scanner.nextLine();
                        if (group.equalsIgnoreCase("Gia đình") ||
                            group.equalsIgnoreCase("Công việc") ||
                            group.equalsIgnoreCase("Bạn bè")) {
                            break;
                        } else {
                            System.out.println("Chỉ được chọn 1 trong 3 nhóm: Gia đình, Công việc, Bạn bè.");
                        }
                    }
                    Contact contact =  new Contact(name, phoneNumber, email, address, group);
                    contactManager.addContact(contact);
                    break;
                case 2:
                    contactManager.displayAllContacts();
                    break;
                case 3:
                    System.out.println("====  Tìm kiếm liên hệ  ====");
                    System.out.print("Nhập tên hoặc số điện thoại: ");
                    String key = scanner.nextLine();
                    Contact foundContact = contactManager.searchContact(key);
                    if (foundContact != null) {
                        System.out.println("Liên hệ tìm thấy: " + foundContact);
                    } else {
                        System.out.println("Không tìm thấy liên hệ với tên hoặc số điện thoại: " + key);
                    }
                    break;
                case 4:
                    System.out.println("====  Xóa liên hệ  ====");
                    System.out.print("Nhập tên hoặc số điện thoại: ");
                    String deleteKey = scanner.nextLine();
                    contactManager.deleteContact(deleteKey);
                    break;
                case 5:
                    System.out.println("====  Cập nhật liên hệ  ====");
                    System.out.print("Nhập tên hoặc số điện thoại liên hệ cần cập nhật: ");
                    String updateKey = scanner.nextLine();
                    Contact contactToUpdate = contactManager.searchContact(updateKey);
                    if (contactToUpdate != null) {
                        System.out.print("Nhập tên mới: ");
                        String newName = scanner.nextLine();
                        System.out.print("Nhập số điện thoại mới: ");
                        String newPhoneNumber = scanner.nextLine();
                        System.out.print("Nhập email mới: ");
                        String newEmail = scanner.nextLine();
                        System.out.print("Nhập địa chỉ mới: ");
                        String newAddress = scanner.nextLine();
                        String newGroup;
                        while (true) {
                            System.out.print("Nhập nhóm mới (Gia đình/Công việc/Bạn bè): ");
                            newGroup = scanner.nextLine();
                            if (newGroup.equalsIgnoreCase("Gia đình") ||
                                newGroup.equalsIgnoreCase("Công việc") ||
                                newGroup.equalsIgnoreCase("Bạn bè")) {
                                break;
                            } else {
                                System.out.println("Chỉ được chọn 1 trong 3 nhóm: Gia đình, Công việc, Bạn bè.");
                            }
                        }
                        contactManager.updateContact(contactToUpdate, newName, newPhoneNumber, newEmail, newAddress, newGroup);
                        System.out.println("Cập nhật thành công.");
                    } else {
                        System.out.println("Không tìm thấy liên hệ với tên hoặc số điện thoại: " + updateKey);
                    }
                    break;
                case 6:
                    contactManager.saveToFile("contact.txt");
                    break;
                case 7:
                    contactManager.readFromFile("contact.txt");
                    break;
                case 8:
                    contactManager.showFavorites();
                    break;
                case 9:
                    System.out.print("Nhập tên hoặc số điện thoại: ");
                    String favKey = scanner.nextLine();
                    contactManager.toggleFavorite(favKey);
                    break;
                case 10:
                    contactManager.sortContacts();
                    break;
                case 11:
                    contactManager.groupContacts();
                    break;
                case 12:
                    contactManager.exportToCSV("contacts.csv");
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
