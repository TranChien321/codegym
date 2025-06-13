package APJ_EXAM_C03_TranQuangChien;

import APJ_EXAM_C03_TranQuangChien.Model.BankAccount;
import APJ_EXAM_C03_TranQuangChien.Model.PaymentAccount;
import APJ_EXAM_C03_TranQuangChien.Model.SavingsAccount;
import APJ_EXAM_C03_TranQuangChien.Manager.BankAccountManager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccountManager manager = new BankAccountManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n==== MENU QUẢN LÝ NGÂN HÀNG ====");
            System.out.println("1. Thêm tài khoản tiết kiệm");
            System.out.println("2. Thêm tài khoản thanh toán");
            System.out.println("3. Hiển thị danh sách tài khoản");
            System.out.println("4. Tìm kiếm theo mã tài khoản");
            System.out.println("5. Xoá tài khoản theo ID");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addSavingsAccount(manager, scanner);
                    break;
                case 2:
                    addPaymentAccount(manager, scanner);
                    break;
                case 3:
                    System.out.println("1. Hiển thị tài khoản tiết kiệm");
                    System.out.println("2. Hiển thị tài khoản thanh toán");
                    System.out.print("Chọn loại tài khoản cần hiển thị: ");
                    int subChoice = Integer.parseInt(scanner.nextLine());
                    if (subChoice == 1) {
                        manager.displaySavingsAccounts();
                    } else if (subChoice == 2) {
                        manager.displayPaymentAccounts();
                    } else {
                        System.out.println("Lựa chọn không hợp lệ.");
                    }
                    break;
                case 4:
                    System.out.print("Nhập mã tài khoản cần tìm: ");
                    String code = scanner.nextLine();
                    BankAccount found = manager.findAccountByCode(code);
                    if (found != null) {
                        System.out.println("Tìm thấy: " + found);
                    } else {
                        System.out.println("Không tìm thấy tài khoản.");
                    }
                    break;
                case 5:
                    System.out.print("Nhập ID tài khoản cần xoá (ví dụ: TK_001): ");
                    String id = scanner.nextLine();
                    manager.deleteAccount(id);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }

        } while (choice != 0);
    }

    private static String inputAccountCode(Scanner scanner) {
        String code;
        while (true) {
            System.out.print("Mã tài khoản (BK_XXXX): ");
            code = scanner.nextLine();
            if (code.matches("BK_\\d{4}")) {
                break;
            } else {
                System.out.println("Mã tài khoản phải theo định dạng BK_XXXX (ví dụ: BK_0001).");
            }
        }
        return code;
    }
    
    private static String inputOwnerName(Scanner scanner) {
        String name;
        while (true) {
            System.out.print("Tên chủ tài khoản: ");
            name = scanner.nextLine();
            if (!name.trim().isEmpty()) {
                break;
            } else {
                System.out.println("Tên không được để trống.");
            }
        }
        return name;
    }
    
    private static String inputDate(Scanner scanner, String label) {
        String date;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        while (true) {
            System.out.print(label + " (dd/MM/yyyy): ");
            date = scanner.nextLine();
            try {
                sdf.parse(date);
                break;
            } catch (ParseException e) {
                System.out.println("Ngày không hợp lệ. Định dạng đúng: dd/MM/yyyy");
            }
        }
        return date;
    }

    private static double inputPositiveDouble(Scanner scanner, String label) {
        double value;
        while (true) {
            System.out.print(label + ": ");
            try {
                value = Double.parseDouble(scanner.nextLine());
                if (value > 0) break;
                else System.out.println(label + " phải lớn hơn 0.");
            } catch (NumberFormatException e) {
                System.out.println(label + " phải là số.");
            }
        }
        return value;
    }

    private static int inputPositiveInt(Scanner scanner, String label) {
        int value;
        while (true) {
            System.out.print(label + ": ");
            try {
                value = Integer.parseInt(scanner.nextLine());
                if (value > 0) break;
                else System.out.println(label + " phải lớn hơn 0.");
            } catch (NumberFormatException e) {
                System.out.println(label + " phải là số nguyên.");
            }
        }
        return value;
    }

    private static String inputCardNumber(Scanner scanner) {
        String card;
        while (true) {
            System.out.print("Số thẻ: ");
            card = scanner.nextLine();
            if (!card.trim().isEmpty()) break;
            else System.out.println("Số thẻ không được để trống.");
        }
        return card;
    }

    public static void addSavingsAccount(BankAccountManager manager, Scanner scanner) {
        System.out.println("== Thêm tài khoản tiết kiệm ==");
        String code = inputAccountCode(scanner);
        String name = inputOwnerName(scanner);
        String date = inputDate(scanner, "Ngày tạo");
        double amount = inputPositiveDouble(scanner, "Số tiền gửi");
        String depositDate = inputDate(scanner, "Ngày gửi");
        double interest = inputPositiveDouble(scanner, "Lãi suất");
        int term = inputPositiveInt(scanner, "Kỳ hạn (tháng)");

        SavingsAccount account = new SavingsAccount("", code, name, date, amount, depositDate, interest, term);
        manager.addAccount(account);
    }

    public static void addPaymentAccount(BankAccountManager manager, Scanner scanner) {
        System.out.println("== Thêm tài khoản thanh toán ==");
        String code = inputAccountCode(scanner);
        String name = inputOwnerName(scanner);
        String date = inputDate(scanner, "Ngày tạo");
        String cardNumber = inputCardNumber(scanner);
        double balance = inputPositiveDouble(scanner, "Số dư");

        PaymentAccount account = new PaymentAccount("", code, name, date, cardNumber, balance);
        manager.addAccount(account);
    }
}
