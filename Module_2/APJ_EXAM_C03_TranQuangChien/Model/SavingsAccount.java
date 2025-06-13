package APJ_EXAM_C03_TranQuangChien.Model;

public class SavingsAccount extends BankAccount {
    private double depositAmount;
    private String depositDate;
    private double interestRate;
    private int term;

    public SavingsAccount(String id, String accountCode, String ownerName, String creationDate,
                          double depositAmount, String depositDate, double interestRate, int term) {
        super(id, accountCode, ownerName, creationDate);
        this.setDepositAmount(depositAmount);
        this.setDepositDate(depositDate);
        this.setInterestRate(interestRate);
        this.setTerm(term);
    }



    @Override
    public String toString() {
        return "SavingsAccount" +
                " - ID: " + getId() +
                " - Mã tài khoản: " + getAccountCode() +
                " - Tên chủ tài khoản: " + getOwnerName() +
                " - Ngày tạo tài khoản: " + getCreatedDate() +
                " - Số tiền gửi: " + getDepositAmount() +
                " - Ngày gửi tiền: " + getDepositDate() +
                " - Lãi suất: " + getInterestRate() +
                " - Kỳ hạn: " + getTerm();
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public String getDepositDate() {
        return depositDate;
    }

    public void setDepositDate(String depositDate) {
        this.depositDate = depositDate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
}
