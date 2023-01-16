package sg.edu.nus.iss;

public class FixedDepositAccount extends BankAccount{
    public static double interest = 3.0;
    public static double duration = 6.0;

    public FixedDepositAccount(String accountNo, double balance) {
        super(accountNo, balance);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("No operation");
    }
    
    @Override
    public void withdraw(double amount) {
        System.out.println("No operation");
    }
    
    @Override
    public void showAccount() {
        System.out.printf("AccountNo: %s\n" , this.getAccountNo());
        System.out.printf("Full name: %s\n" , this.getFullName());
        System.out.printf("Balance: %.2f\n" , this.getBalance() * (100 + interest)/100);
    }


    
    

}
