import java.math.BigDecimal;

public class User {
    private  String accountNo;
    private BigDecimal balance;
    public User(String accountNo,BigDecimal balance){
        this.accountNo=accountNo;
        this.balance=balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
