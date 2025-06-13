package APJ_EXAM_C03_TranQuangChien.Model;

public class PaymentAccount extends BankAccount{
    private String cardNumber;
    private double balance;

    public PaymentAccount(String id, String accountCode, String ownerName, String creationDate,
                          String cardNumber, double balance) {
        super(id, accountCode, ownerName, creationDate);
        this.setCardNumber(cardNumber);
        this.setBalance(balance);
    }



    @Override
    public String toString() {
        return "PaymentAccount" +
                " - ID: " + getId() +
                " - Mã tài khoản: " + getAccountCode() +
                " - Tên chủ tài khoản: " + getOwnerName() +
                " - Ngày tạo tài khoản: " + getCreatedDate() +
                " - Số thẻ: " + getCardNumber() +
                " - Số dư: " + getBalance();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
