package Projectmini;

import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = Product.readProductFromFile("product.txt");
        ProductManager productManager = new ProductManager(products);
        System.out.println("==== MENU QUẢN LÝ SẢN PHẨM ====");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Hiển thị tất cả sản phẩm");
        System.out.println("3. Tìm kiếm sản phẩm theo ID");
        System.out.println("4. Cập nhật thông tin sản phẩm");
        System.out.println("5. Xóa sản phẩm theo ID");
        System.out.println("6. Sắp xếp sản phẩm theo giá");
        System.out.println("7. Tính tổng giá trị kho");
        System.out.println("8. Lưu File");
        System.out.println("9. Đọc File");
        System.out.println("10. Thoát");

        while (true) {
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập ID sản phẩm: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập giá sản phẩm: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Nhập số lượng sản phẩm: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập mô tả sản phẩm: ");
                    String description = scanner.nextLine();
                    Product product = new Product(id, name, price, quantity, description);
                    productManager.addProduct(product);
                    break;
                case 2:
                    productManager.displayAllProducts();
                    break;
                case 3:
                    System.out.print("Nhập ID sản phẩm cần tìm: ");
                    int searchId = scanner.nextInt();
                    scanner.nextLine();
                    Product found = productManager.searchByIdProduct(searchId);
                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("Không tìm thấy sản phẩm với ID: " + searchId);
                    }
                    break;
                case 4:
                    System.out.print("Nhập ID sản phẩm cần cập nhật: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập tên mới: ");
                    String newName = scanner.nextLine();
                    System.out.print("Nhập giá mới: ");
                    double newPrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Nhập số lượng mới: ");
                    int newQuantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập mô tả mới: ");
                    String newDescription = scanner.nextLine();
                    productManager.updateProduct(updateId, newName, newPrice, newQuantity, newDescription);
                    break;
                case 5:
                    System.out.print("Nhập ID sản phẩm cần xóa: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    productManager.deleteProduct(deleteId);
                    break;
                case 6:
                    productManager.sortProductsByPrice();
                    break;
                case 7:
                    double total = productManager.totalInventoryValue();
                    System.out.println("Tổng giá trị kho: " + total);
                    break;
                case 8:
                    productManager.saveToFile();
                    break;
                case 9:
                    productManager.loadFromFile();
                    break;
                case 10:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
