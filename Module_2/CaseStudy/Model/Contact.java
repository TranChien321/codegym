package CaseStudy.Model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Contact implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    private String group;
    private boolean isFavorite;

    public Contact() {
    }

    /**
     * Khởi tạo liên hệ với thông tin cơ bản, mặc định không yêu thích.
     */
    public Contact(String name, String phoneNumber, String email, String address, String group) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.group = group;
        this.isFavorite = false;
    }

    /**
     * Khởi tạo liên hệ với thông tin đầy đủ, bao gồm trạng thái yêu thích.
     */
    public Contact(String name, String phoneNumber, String email, String address, String group, boolean isFavorite) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.group = group;
        this.isFavorite = isFavorite;
    }

    /**
     * Ghi danh sách liên hệ vào file.
     */
    public static void writeContactToFile(String file, List<Contact> contacts) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(contacts);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
    }

    /**
     * Đọc danh sách liên hệ từ file.
     */
    public static List<Contact> readContactFromFile(String file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Contact>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    /**
     * Tạo phương thức getter và setter cho các thuộc tính của Contact.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", group='" + group + '\'' +
                ", isFavorite=" + isFavorite +
                '}';
    }
}
