package sg.edu.nus.iss;

import java.util.Random;
import java.util.UUID;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Banking!");

        int n =3;

        BankAccount bankAccount[] = new BankAccount[n];

        for (int i = 0; i < bankAccount.length; i++){
            String uuid = UUID.randomUUID().toString();

            // double max = 10000.0;
            double min = 1000.0;

            Random randomNum = new Random();
            double initialBalance = min + randomNum.nextDouble();
            bankAccount[i] = new FixedDepositAccount(uuid, initialBalance);

        }
        bankAccount[0].setFullName("daryl");
        bankAccount[1].setFullName("Aqif");
        bankAccount[2].setFullName("Vincent");

        bankAccount[0].showAccount();
        bankAccount[1].showAccount();
        bankAccount[2].showAccount();
        
        bankAccount[0].deposit(120.00);
        bankAccount[0].showAccount();
        bankAccount[0].withdraw(1300.00);
        bankAccount[0].showAccount();
        bankAccount[0].setIsactive(false);
        
    }
}
