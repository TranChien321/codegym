package APJ_EXAM_C03_TranQuangChien.Model;

public class BankAccount {
    private String id;
    private String accountCode;
    private String ownerName;
    private String createdDate;

    public BankAccount(String id, String accountCode, String ownerName, String createdDate) {
        this.setId(id);
        this.setAccountCode(accountCode);
        this.setOwnerName(ownerName);
        this.setCreatedDate(createdDate);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "BankAccount" +
                " - ID: " + id +
                " - Mã tài khoản: " + accountCode +
                " - Tên chủ tài khoản: " + ownerName +
                " - Ngày tạo tài khoản: " + createdDate;
    }

    public String getInfo() {
        return toString();
    }
}
