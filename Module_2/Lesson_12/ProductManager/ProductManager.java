package Lesson_12.ProductManager;

import java.util.*;

public class ProductManager {
    private List<Product> productList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addProduct() {
        System.out.print("Nhập ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá: ");
        double price = sc.nextDouble();
        productList.add(new Product(id, name, price));
        System.out.println("Thêm thành công.");
    }

    public void editProduct() {
        System.out.print("Nhập ID cần sửa: ");
        int id = sc.nextInt();
        sc.nextLine();
        for (Product p : productList) {
            if (p.getId() == id) {
                System.out.print("Tên mới: ");
                String name = sc.nextLine();
                System.out.print("Giá mới: ");
                double price = sc.nextDouble();
                p.setName(name);
                p.setPrice(price);
                System.out.println("Sửa thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy ID.");
    }

    public void removeProduct() {
        System.out.print("Nhập ID cần xoá: ");
        int id = sc.nextInt();
        Iterator<Product> it = productList.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == id) {
                it.remove();
                System.out.println("Xoá thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy ID.");
    }

    public void displayProducts() {
        if (productList.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    public void searchProduct() {
        System.out.print("Nhập tên cần tìm: ");
        String keyword = sc.nextLine().toLowerCase();
        for (Product p : productList) {
            if (p.getName().toLowerCase().contains(keyword)) {
                System.out.println(p);
            }
        }
    }

    public void sortByPrice() {
        productList.sort(Comparator.comparingDouble(Product::getPrice));
        System.out.println("Sắp xếp theo giá tăng dần.");
    }

    public void menu() {
        int choice;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Thêm");
            System.out.println("2. Sửa");
            System.out.println("3. Xoá");
            System.out.println("4. Hiển thị");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Sắp xếp");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    editProduct();
                    break;
                case 3:
                    removeProduct();
                    break;
                case 4:
                    displayProducts();
                    break;
                case 5:
                    searchProduct();
                    break;
                case 6:
                    sortByPrice();
                    break;
                case 0:
                    System.out.println("Kết thúc.");
                    break;
                default:
                    System.out.println("Sai lựa chọn.");
                    break;
            }
        } while (choice != 0);
    }

    public static void main(String[] args) {
        new ProductManager().menu();
    }
}
