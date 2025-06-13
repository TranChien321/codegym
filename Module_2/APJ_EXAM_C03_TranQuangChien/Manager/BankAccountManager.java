package APJ_EXAM_C03_TranQuangChien.Manager;

import APJ_EXAM_C03_TranQuangChien.Model.BankAccount;
import APJ_EXAM_C03_TranQuangChien.Model.PaymentAccount;
import APJ_EXAM_C03_TranQuangChien.Model.SavingsAccount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccountManager {
    private List<BankAccount> accounts;
    private static final String CSV_FILE = "Module_2/APJ_EXAM_C03_TranQuangChien/bank_accounts.csv";
    private int nextId = 1;

    public BankAccountManager() {
        this.accounts = new ArrayList<>();
        loadNextIdFromCSV();
        loadAccountsFromCSV();
    }

    private void loadNextIdFromCSV() {
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            int maxId = 0;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", -1);
                if (parts.length >= 1) {
                    String idStr = parts[0];
                    if (idStr.startsWith("BK_")) {
                        try {
                            int idNum = Integer.parseInt(idStr.substring(3));
                            if (idNum > maxId) maxId = idNum;
                        } catch (NumberFormatException ignored) {}
                    }
                }
            }
            nextId = maxId + 1;
        } catch (IOException e) {
            nextId = 1;
        }
    }

    // Đọc toàn bộ dữ liệu từ file CSV vào danh sách accounts
    private void loadAccountsFromCSV() {
        accounts.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", -1);
                if (parts.length == 8) {
                    SavingsAccount account = new SavingsAccount(
                        parts[0], parts[1], parts[2], parts[3],
                        Double.parseDouble(parts[4]), parts[5],
                        Double.parseDouble(parts[6]), Integer.parseInt(parts[7])
                    );
                    accounts.add(account);
                } else if (parts.length == 6) {
                    PaymentAccount account = new PaymentAccount(
                        parts[0], parts[1], parts[2], parts[3],
                        parts[4], Double.parseDouble(parts[5])
                    );
                    accounts.add(account);
                } else if (parts.length >= 4) {
                    BankAccount account = new BankAccount(
                        parts[0], parts[1], parts[2], parts[3]
                    );
                    accounts.add(account);
                }
            }
        } catch (IOException e) {
            // Không cần thông báo nếu file chưa tồn tại
        }
    }

    public String getNextId() {
        return String.format("BK_%04d", nextId++);
    }

    public void addAccount(BankAccount account) {
        String newId = getNextId();
        account.setId(newId);
        accounts.add(account);
        writeAccountToCSV(account);
        System.out.println("Thêm tài khoản ngân hàng thành công! ID tài khoản: " + newId);
    }
    
    private void writeAccountToCSV(BankAccount account) {
        try (FileWriter writer = new FileWriter(CSV_FILE, true)) {
            if (account instanceof SavingsAccount) {
                SavingsAccount sa = (SavingsAccount) account;
                writer.write(sa.getId() + "," +
                        sa.getAccountCode() + "," +
                        sa.getOwnerName() + "," +
                        sa.getCreatedDate() + "," +
                        sa.getDepositAmount() + "," +
                        sa.getDepositDate() + "," +
                        sa.getInterestRate() + "," +
                        sa.getTerm() + "\n");
            } else if (account instanceof PaymentAccount) {
                PaymentAccount pa = (PaymentAccount) account;
                writer.write(pa.getId() + "," +
                        pa.getAccountCode() + "," +
                        pa.getOwnerName() + "," +
                        pa.getCreatedDate() + "," +
                        pa.getCardNumber() + "," +
                        pa.getBalance() + "\n");
            } else {
                writer.write(account.getId() + "," +
                        account.getAccountCode() + "," +
                        account.getOwnerName() + "," +
                        account.getCreatedDate() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file CSV: " + e.getMessage());
        }
    }
    
    public boolean deleteAccount(String id) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId().equals(id)) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Bạn có chắc chắn muốn xoá tài khoản có ID " + id + " không? (y/n): ");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("y")) {
                    accounts.remove(i);
                    // Ghi lại toàn bộ danh sách vào file để đồng bộ dữ liệu
                    overwriteCSV();
                    System.out.println("Đã xoá tài khoản có ID: " + id);
                    return true;
                } else {
                    System.out.println("Huỷ xoá tài khoản.");
                    return false;
                }
            }
        }
        System.out.println("Không tìm thấy tài khoản có ID: " + id);
        return false;
    }

    // Ghi lại toàn bộ danh sách vào file CSV (dùng khi xóa)
    private void overwriteCSV() {
        try (FileWriter writer = new FileWriter(CSV_FILE, false)) {
            for (BankAccount account : accounts) {
                if (account instanceof SavingsAccount) {
                    SavingsAccount sa = (SavingsAccount) account;
                    writer.write(sa.getId() + "," +
                            sa.getAccountCode() + "," +
                            sa.getOwnerName() + "," +
                            sa.getCreatedDate() + "," +
                            sa.getDepositAmount() + "," +
                            sa.getDepositDate() + "," +
                            sa.getInterestRate() + "," +
                            sa.getTerm() + "\n");
                } else if (account instanceof PaymentAccount) {
                    PaymentAccount pa = (PaymentAccount) account;
                    writer.write(pa.getId() + "," +
                            pa.getAccountCode() + "," +
                            pa.getOwnerName() + "," +
                            pa.getCreatedDate() + "," +
                            pa.getCardNumber() + "," +
                            pa.getBalance() + "\n");
                } else {
                    writer.write(account.getId() + "," +
                            account.getAccountCode() + "," +
                            account.getOwnerName() + "," +
                            account.getCreatedDate() + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file CSV: " + e.getMessage());
        }
    }
    
    public void displayAccounts() {
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            boolean hasData = false;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", -1);
                if (parts.length == 8) {
                    SavingsAccount account = new SavingsAccount(
                        parts[0], parts[1], parts[2], parts[3],
                        Double.parseDouble(parts[4]), parts[5],
                        Double.parseDouble(parts[6]), Integer.parseInt(parts[7])
                    );
                    System.out.println(account);
                    hasData = true;
                } else if (parts.length == 6) {
                    PaymentAccount account = new PaymentAccount(
                        parts[0], parts[1], parts[2], parts[3],
                        parts[4], Double.parseDouble(parts[5])
                    );
                    System.out.println(account);
                    hasData = true;
                } else if (parts.length >= 4) {
                    BankAccount account = new BankAccount(
                        parts[0], parts[1], parts[2], parts[3]
                    );
                    System.out.println(account);
                    hasData = true;
                }
            }
            if (!hasData) {
                System.out.println("Danh sách tài khoản trống.");
            }
        } catch (IOException e) {
            System.out.println("Không thể đọc file hoặc file chưa tồn tại.");
        }
    }

    public void displaySavingsAccounts() {
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            boolean hasData = false;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", -1);
                if (parts.length == 8) {
                    SavingsAccount account = new SavingsAccount(
                        parts[0], parts[1], parts[2], parts[3],
                        Double.parseDouble(parts[4]), parts[5],
                        Double.parseDouble(parts[6]), Integer.parseInt(parts[7])
                    );
                    System.out.println(account);
                    hasData = true;
                }
            }
            if (!hasData) {
                System.out.println("Danh sách tài khoản tiết kiệm trống.");
            }
        } catch (IOException e) {
            System.out.println("Không thể đọc file hoặc file chưa tồn tại.");
        }
    }

    public void displayPaymentAccounts() {
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            boolean hasData = false;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", -1);
                if (parts.length == 6) {
                    PaymentAccount account = new PaymentAccount(
                        parts[0], parts[1], parts[2], parts[3],
                        parts[4], Double.parseDouble(parts[5])
                    );
                    System.out.println(account);
                    hasData = true;
                }
            }
            if (!hasData) {
                System.out.println("Danh sách tài khoản thanh toán trống.");
            }
        } catch (IOException e) {
            System.out.println("Không thể đọc file hoặc file chưa tồn tại.");
        }
    }
    
    public BankAccount findAccountByCode(String code) {
        for (BankAccount account : accounts) {
            if (account.getAccountCode().equals(code)) {
                return account;
            }
        }
        return null;
    }
}
