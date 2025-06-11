package CaseStudy;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ContactManager {
    private List<Contact> contacts;

    /**
     * Khởi tạo ContactManager với danh sách liên hệ.
     */
    public ContactManager(List<Contact> contacts) {
        this.contacts = contacts != null ? contacts : new ArrayList<>();
    }

    /**
     * Thêm một liên hệ mới vào danh sách và lưu vào file.
     */
    public void addContact(Contact contact) {
        contacts.add(contact);
        Contact.writeContactToFile("contacts.txt", contacts);
        System.out.println("Thêm liên hệ thành công.");
    }

    /**
     * Hiển thị toàn bộ danh sách liên hệ.
     */
    public void displayAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Không có liên hệ nào.");
        } else {
            System.out.println("Danh sách liên hệ:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    /**
     * Tìm kiếm liên hệ theo tên hoặc số điện thoại.
     */
    public Contact searchContact(String key) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(key) || contact.getPhoneNumber().equals(key)) {
                return contact;
            }
        }
        return null;
    }

    /**
     * Xóa liên hệ theo tên hoặc số điện thoại.
     */
    public void deleteContact(String key) {
        Contact contact = searchContact(key);
        if (contact != null) {
            contacts.remove(contact);
            Contact.writeContactToFile("contacts.txt", contacts);
            System.out.println("Xóa liên hệ thành công.");
        } else {
            System.out.println("Không tìm thấy liên hệ với tên hoặc số điện thoại: " + key);
        }
    }

    /**
     * Cập nhật thông tin cho một liên hệ đã có.
     */
    public void updateContact(Contact contactToUpdate, String name, String phoneNumber, String email, String address, String group) {
        if (contactToUpdate != null) {
            contactToUpdate.setName(name);
            contactToUpdate.setPhoneNumber(phoneNumber);
            contactToUpdate.setEmail(email);
            contactToUpdate.setAddress(address);
            contactToUpdate.setGroup(group);
            Contact.writeContactToFile("contacts.txt", contacts);
            System.out.println("Cập nhật thông tin liên hệ thành công.");
        } else {
            System.out.println("Không tìm thấy liên hệ để cập nhật.");
        }
    }

    /**
     * Chuyển trạng thái yêu thích của liên hệ theo tên hoặc số điện thoại.
     */
    public void toggleFavorite(String key) {
        Contact contact = searchContact(key);
        if (contact != null) {
            contact.setFavorite(!contact.isFavorite());
            Contact.writeContactToFile("contacts.txt", contacts);
            System.out.println("Cập nhật trạng thái yêu thích thành công.");
        } else {
            System.out.println("Không tìm thấy liên hệ với tên hoặc số điện thoại: " + key);
        }
    }

    /**
     * Hiển thị các liên hệ được đánh dấu yêu thích.
     */
    public void showFavorites() {
        boolean hasFavorites = false;
        for (Contact contact : contacts) {
            if (contact.isFavorite()) {
                System.out.println(contact);
                hasFavorites = true;
            }
        }
        if (!hasFavorites) {
            System.out.println("Không có liên hệ yêu thích nào.");
        }
    }

    /**
     * Sắp xếp danh sách liên hệ theo tên.
     */
    public void sortContacts() {
        contacts.sort((c1, c2) -> c1.getName().compareTo(c2.getName()));
        Contact.writeContactToFile("contacts.txt", contacts);
        System.out.println("Sắp xếp danh sách liên hệ thành công.");
    }

    /**
     * Hiển thị danh sách liên hệ theo từng nhóm.
     */
    public void groupContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Không có liên hệ nào để phân nhóm.");
            return;
        }
        System.out.println("📂 Danh sách liên hệ theo nhóm:");
        contacts.stream()
                .collect(Collectors.groupingBy(Contact::getGroup))
                .forEach((group, groupContacts) -> {
                    System.out.println("========== Nhóm: " + group + " ==========");
                    groupContacts.forEach(contact -> {
                        System.out.println("📞 " + contact.getName() + " | " + contact.getPhoneNumber());
                    });
                    System.out.println();
                });
    }

    /**
     * Lưu danh sách liên hệ vào file.
     */
    public void saveToFile(String file) {
        Contact.writeContactToFile(file, contacts);
        System.out.println("Đã lưu danh sách liên hệ vào file.");
    }

    /**
     * Đọc danh sách liên hệ từ file.
     */
    public void readFromFile(String file) {
        contacts = Contact.readContactFromFile(file);
        System.out.println("Đã đọc danh sách liên hệ từ file.");
    }

    /**
     * Xuất danh sách liên hệ ra file CSV.
     */
    public void exportToCSV(String file) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            writer.println("Name,PhoneNumber,Email,Address,Group,IsFavorite");
            for (Contact contact : contacts) {
                writer.printf("%s,%s,%s,%s,%s,%b%n",
                        contact.getName(),
                        contact.getPhoneNumber(),
                        contact.getEmail(),
                        contact.getAddress(),
                        contact.getGroup(),
                        contact.isFavorite());
            }
            System.out.println("Đã xuất danh sách liên hệ ra file CSV.");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file CSV: " + e.getMessage());
        }
    }
}
