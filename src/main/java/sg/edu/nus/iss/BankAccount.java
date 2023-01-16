package sg.edu.nus.iss;

import java.sql.Date;

public class BankAccount {
    private final String accountNo;
    private String fullName;
    private double balance = 0.0;
    private boolean isactive = true;
    private Date accountStartDate;
    private Date accountEndDate;

    public String getAccountNo() {return accountNo;}

    public String getFullName() {return fullName;}
    public void setFullName(String fullName) {this.fullName = fullName;}

    public double getBalance() {return balance;}
    public void setBalance(double balance) {this.balance = balance;}

    public boolean isIsactive() {return isactive;}
    public void setIsactive(boolean isactive) {this.isactive = isactive;}
    public Date getAccountStartDate() {return accountStartDate;}
    public void setAccountStartDate(Date accountStartDate) {this.accountStartDate = accountStartDate;}
    public Date getAccountEndDate() {return accountEndDate;}
    public void setAccountEndDate(Date accountEndDate) {this.accountEndDate = accountEndDate;}

    
    public BankAccount(String accountNo, String fullName) {
        this.accountNo = accountNo;
        this.fullName = fullName;
    }

    public BankAccount(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public BankAccount(String accountNo, String fullName, double balance) {
        this.accountNo = accountNo;
        this.fullName = fullName;
        this.balance = balance;
    }

    public BankAccount(String accountNo, String fullName, double balance, boolean isactive, Date accountStartDate,
            Date accountEndDate) {
        this.accountNo = accountNo;
        this.fullName = fullName;
        this.balance = balance;
        this.isactive = isactive;
        this.accountStartDate = accountStartDate;
        this.accountEndDate = accountEndDate;
    }

    public void showAccount(){
        System.out.printf("AccountNo: %s\n" , accountNo);
        System.out.printf("Full name %s\n: " , fullName);
        System.out.printf("Balance: %.2f\n" , balance);
    }

    public void deposit(double amount){
        if(!isIsactive()){
            throw new IllegalArgumentException("You cannot make deposit to a closed account.");
        }
        if (amount < 0){
            throw new IllegalArgumentException("You cannot make negative deposit.");
        } else{
            balance += amount;
        }
    }
    public void withdraw(double amount){
        if(!isIsactive()){
            throw new IllegalArgumentException("You cannot make withdrawal from a closed account.");
        }
        if (getBalance() <= amount){
            throw new IllegalArgumentException("Your balance is less than " + amount);
        } else{
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "BankAccount [accountNo=" + accountNo + ", fullName=" + fullName + ", balance=" + balance + ", isactive="
                + isactive + ", accountStartDate=" + accountStartDate + ", accountEndDate=" + accountEndDate + "]";
    }

    
    
    
}
