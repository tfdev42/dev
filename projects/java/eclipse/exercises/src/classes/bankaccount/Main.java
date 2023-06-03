package classes.bankaccount;

public class Main {
    public static void main(String[] args) {
        
        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountNumber("AT098172340987210987123");
        bankAccount.setCustomerName("Testy McTestface");
        bankAccount.setCustomerEmail("email@email.com");
        bankAccount.setPhoneNumber("321 - 321656216");
        bankAccount.setBalance(0);

        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(45.54);
        bankAccount.deposit(9876.1234);
        bankAccount.withdraw(6137.57);
        bankAccount.deposit(15);
        bankAccount.withdraw(3753.56);
        System.out.println();

        BankAccount bobsBankAccount = new BankAccount("DE32065465635016540654", 0.00, "Bob McBobface", "bob@bob.bob", "+49 654065 6103-01");
        System.out.println(bobsBankAccount.getCustomerName());
        System.out.println(bobsBankAccount.getAccountNumber());
        System.out.println(bobsBankAccount.getBalance());
        System.out.println();

        BankAccount defBankAccount = new BankAccount();
        System.out.println(defBankAccount.getAccountNumber());
        System.out.println(defBankAccount.getCustomerName());
        System.out.println(defBankAccount.getBalance());
        System.out.println();


    }
}
