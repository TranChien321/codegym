package Lesson_17.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Product implements Serializable{
    private int id;
    private String name;
    private double price;
    private String manufacturer;
    private String description;


    public Product() {
    }

    public Product(int id, String name, double price, String manufacturer, String description) {
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
        this.setManufacturer(manufacturer);
        this.setDescription(description);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
//  Lưu
    public static void writeProductToFile(String Path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(Path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            System.out.println("Lưu danh sách thành công!! ");
        } catch (IOException e) {
            System.out.println("Lưu danh sách thất bại!! ");
        }
    }
//  Đọc
    public static List<Product> readProductFromFile(String Path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(Path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Product> productList = (List<Product>) ois.readObject();
            if(productList != null && products.size() > 0){
                products = productList;
            }
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Đọc danh sách thất bại!! ");
        }
        return products;
    }

    // Hiển thị danh sách sản phẩm
    public static void displayProducts(List<Product> products) {
        if (products == null || products.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
            return;
        }
        for (Product product : products) {
            System.out.println(product);
        }
    }

    //  Tìm
    public static Product findProductById(List<Product> products, int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    //  Xóa
    public static void deleteProductById(List<Product> products, int id) {
        boolean removed = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                removed = true;
                break;
            }
        }
        if (removed) {
            System.out.println("Xóa thành công!! ");
        } else {
            System.out.println("Không tìm thấy sản phẩm để xóa.");
        }
    }
}
