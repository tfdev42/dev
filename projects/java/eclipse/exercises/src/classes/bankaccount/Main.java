package classes.bankaccount;

public class Main {
    public static void main(String[] args) {
        
        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountNumber("AT098172340987210987123");
        bankAccount.setCustomerName("Testy McTestface");
        bankAccount.setBalance(0);

        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(45.54);
        bankAccount.deposit(9876.1234);
        bankAccount.withdraw(6137.57);
        bankAccount.deposit(15);
        bankAccount.withdraw(3753.56);


    }
}
