package Lesson_17.Product;

import java.util.List;
import java.util.Scanner;

import static Lesson_17.Product.Product.readProductFromFile;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = readProductFromFile("src/Lesson_17/Product/product.txt");
        while (true) {
            System.out.println("1. Hiển thị danh sách sản phẩm");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm theo ID");
            System.out.println("4. Xóa sản phẩm theo ID");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Danh sách sản phẩm: ");
                    for (Product product : products) {
                        System.out.println(product);
                    }
                    break;
                case 2:
                    System.out.print("Nhập ID sản phẩm: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập giá sản phẩm: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Nhập nhà sản xuất: ");
                    String manufacturer = scanner.nextLine();
                    System.out.print("Nhập mô tả: ");
                    String description = scanner.nextLine();
                    products.add(new Product(id, name, price, manufacturer, description));
                    System.out.println("Thêm thành công.");
                    break;
                case 3:
                    System.out.print("Nhập ID sản phẩm: ");
                    int idSearch = scanner.nextInt();
                    Product product = Product.findProductById(products, idSearch);
                    if (product != null) {
                        System.out.println("Sản phẩm tìm thấy: " + product);
                    } else {
                        System.out.println("Không tìm thấy sản phẩm.");
                    }
                    break;
                case 4:
                    System.out.print("Nhập ID sản phẩm: ");
                    int idDelete = scanner.nextInt();
                    Product.deleteProductById(products, idDelete);
                    System.out.println("Xóa thành công.");
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }

        }
    }

}
