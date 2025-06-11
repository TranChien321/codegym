package Projectmini;

import java.util.List;
import java.util.ArrayList;

public class ProductManager {
    private List<Product> products;

    public ProductManager(List<Product> products) {
        this.products = products != null ? products : new ArrayList<>();
    }

    // Thêm sản phẩm vào danh sách file
    public void addProduct(Product product) {
        products.add(product);
        Product.writeProductToFile("product.txt", products);
        System.out.println("Thêm sản phẩm thành công.");
    }

    // Hiển thị toàn bộ danh sách sản phẩm
    public void displayAllProducts() {
        if (products.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
        } else {
            System.out.println("Danh sách sản phẩm:");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    // Tìm kiếm sản phẩm theo ID
    public Product searchByIdProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    // Cập nhật thông tin sản phẩm
    public void updateProduct(int id, String name, double price, int quantity, String description) {
        Product product = searchByIdProduct(id);
        if (product != null) {
            product.setName(name);
            product.setPrice(price);
            product.setQuantity(quantity);
            product.setDescription(description);
            Product.writeProductToFile("product.txt", products);
            System.out.println("Cập nhật sản phẩm thành công.");
        } else {
            System.out.println("Không tìm thấy sản phẩm với ID: " + id);
        }
    }

    // Xóa sản phẩm theo ID
    public void deleteProduct(int id) {
        Product product = searchByIdProduct(id);
        if (product != null) {
            products.remove(product);
            Product.writeProductToFile("product.txt", products);
            System.out.println("Xóa sản phẩm thành công.");
        } else {
            System.out.println("Không tìm thấy sản phẩm với ID: " + id);
        }
    }

    // Sắp xếp sản phẩm theo giá sử dụng hàm sort
    public void sortProductsByPrice() {
        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        System.out.println("Đã sắp xếp sản phẩm theo giá.");
    }

    //Thống kê tổng giá trị của tất cả sản phẩm
    public double totalInventoryValue() {
        double totalValue = 0;
        for (Product product : products) {
            totalValue += product.getPrice() * product.getQuantity();
        }
        return totalValue;
    }

    // Lưu ra file
    public void saveToFile() {
        Product.writeProductToFile("product.txt", products);
        System.out.println("Đã lưu danh sách sản phẩm vào file.");
    }

    // Đọc từ file
    public void loadFromFile() {
        List<Product> loaded = Product.readProductFromFile("product.txt");
        if (loaded != null && !loaded.isEmpty()) {
            this.products = loaded;
            System.out.println("Đã tải danh sách sản phẩm từ file.");
        } else {
            this.products = new ArrayList<>();
            System.out.println("Không có sản phẩm nào trong file.");
        }
    }
}
