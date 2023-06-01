package classes.bankaccount;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public void setCustomerName(String name){
        this.customerName = name;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setBalance(long balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double deposit(double funds){
        if (funds < 0) {
            System.out.println("Deposit must be positive");            
        }
        else balance += funds;
        System.out.printf("New Balance after depositing %.2f : %.2f%n", funds, balance);
        return balance;
    }
    public double withdraw(double funds){
        if (balance < funds) {
            System.out.printf("Can't withdraw %.2f, balance is %.2f%n", funds, getBalance());
        }
        else {
            balance -= funds;
            System.out.printf("New Balance after withdrawing %.2f: %.2f%n", funds, balance);
        }
        return balance;
    }



}
